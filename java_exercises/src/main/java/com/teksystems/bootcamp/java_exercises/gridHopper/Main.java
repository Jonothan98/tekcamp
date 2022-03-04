package com.teksystems.bootcamp.java_exercises.gridHopper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
//        LocationPointer finalPositition = new LocationPointer();

        System.out.println("Enter a number to be a square array");
        int arrayValue;

        arrayValue = myScanner.nextInt();

        System.out.println(BoardHopper.hop(BoardGenerator.createBoard(arrayValue, arrayValue)));


//        while(myScanner.hasNextInt()){
//            arrayValue = myScanner.nextInt();
//
//
//
//        }



    }
}
