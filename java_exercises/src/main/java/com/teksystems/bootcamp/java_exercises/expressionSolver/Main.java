package com.teksystems.bootcamp.java_exercises.expressionSolver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String usersExpression = myScanner.nextLine();

        Term term = ExpressionParser.ParseExpression(usersExpression);

        System.out.println("solving " + usersExpression);
        System.out.println(term.getValue());
    }
}
