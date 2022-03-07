package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class ExponentOperation extends Operation{

    @Override
    public double calculate(double val1, double val2) {
        return Math.pow(val1, val2);
    }
}
