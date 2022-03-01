package com.teksystems.bootcamp.java_exercises.additionalInputs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        NumberAggregator aggregator = new NumberAggregator();

        int userNumber;
        System.out.println("Enter an integer to add or a non-integer to see your total:");

        while(myScanner.hasNextInt()){

            System.out.println("Enter an integer to add or a non-integer to see your total:");
            userNumber = myScanner.nextInt();
            aggregator.addNumber(userNumber);

        }

        System.out.println("Your total is: " + aggregator.addNumber(0));


    }
}
