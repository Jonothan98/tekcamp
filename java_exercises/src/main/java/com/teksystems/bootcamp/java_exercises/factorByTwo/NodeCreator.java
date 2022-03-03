package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class NodeCreator {

    public static Node createNode(int number){
        if(number == 2 || number%2 != 0){
            return new ValueNode(number);
        }

        return new PointerNode(createNode(2),createNode(number/2));
    }
}
