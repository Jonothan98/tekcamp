package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class PointerNode extends Node{

    Node node1;
    Node node2;

    public PointerNode(Node node1, Node node2){

        this.node1 = node1;
        this.node2 = node2;

    }

    @Override
    public int getCountOfTwos() {
        return (node1.getCountOfTwos() + node2.getCountOfTwos());
    }
}
