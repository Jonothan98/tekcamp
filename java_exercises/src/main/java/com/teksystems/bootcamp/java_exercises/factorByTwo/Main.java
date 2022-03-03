package com.teksystems.bootcamp.java_exercises.factorByTwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number;

        System.out.println("Enter an integer to be factored...");

        while (myScanner.hasNextInt()) {
            number = myScanner.nextInt();
            Node node = NodeCreator.createNode(number);
            System.out.println("There are " + node.getCountOfTwos() + " 2s factored out");
        }
    }
}
