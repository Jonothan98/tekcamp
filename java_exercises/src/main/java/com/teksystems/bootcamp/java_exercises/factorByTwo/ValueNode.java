package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class ValueNode extends Node {

    private final int num;

    public ValueNode(int num){
        this.num = num;
    }

    @Override
    public int getCountOfTwos() {

        if(num == 2){
            return 1;
        }

        return 0;
    }
}
