package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class Expression extends Term{

    Term term1;
    Term term2;
    Operation operation1;

    public Expression(Term term1,Operation operation1, Term term2){

        this.term1 = term1;
        this.operation1 = operation1;
        this.term2 = term2;

    }

    @Override
    public double getValue() {
        return operation1.calculate(term1.getValue(), term2.getValue());
    }
}
