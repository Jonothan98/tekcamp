package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class ExpressionParser {

    public static Term ParseExpression(String input){

        if(input.matches("[0-9]+")){
            return new Constant(Double.parseDouble(input));
        }

        String term1 = "";
        String term2 = "";
        Operation op = null;
        int i = 0;

        for(i = input.length()-1; i >= 0; i--){
            if(input.charAt(i) == '+' || input.charAt(i) == '-'){
                if(input.charAt(i) == '+'){
                    op = new AdditionOperation();
                } else {
                    op = new SubtractionOperation();
                }
                break;
            }
        }

        if(op == null){
            for(i = input.length()-1; i >=0; i--){
                if(input.charAt(i) == '/' || input.charAt(i) == '%' || input.charAt(i) == '*'){
                    if(input.charAt(i) == '/'){
                        op = new DivisionOperation();
                    } else if( input.charAt(i) == '%'){
                        op = new ModuloOperation();
                    } else {
                        op = new MultiplicationOperation();
                    }
                    break;
                }
            }
        }

        if(op == null){
            for(i = input.length()-1; i >=0; i--){
                if(input.charAt(i) == '^'){
                    op = new ExponentOperation();
                    break;
                }
            }
        }

        term1 = input.substring(0,i);
        term2 = input.substring(i+1);
        return new Expression(ParseExpression(term1), op, ParseExpression(term2));

    }
}
