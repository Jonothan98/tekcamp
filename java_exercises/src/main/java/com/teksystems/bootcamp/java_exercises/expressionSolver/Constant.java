package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class Constant extends Term{

    private double value;

    public Constant( double value){
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
