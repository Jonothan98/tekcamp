package com.teksystems.bootcamp.java_exercises.gridHopper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number to be a square array");
        int arrayValue= myScanner.nextInt();

        if(arrayValue <= 0){
            System.out.println("Please input an integer higher then 0 ");
        } else {
            LocationPointer[][] myBoard = BoardGenerator.createBoard(arrayValue,arrayValue);

            for(int i = 0; i < myBoard.length; i++){
                System.out.println(" ");
                for(int j = 0; j < myBoard.length; j++){
                    System.out.print("(" + myBoard[i][j].getTargetX() + ","+ myBoard[i][j].getTargetY() + ") ");
                }
            }

            LocationPointer finalValue = BoardHopper.hop(myBoard);
            System.out.println("\nThis is the final Position (" + finalValue.getTargetX() + "," + finalValue.getTargetY() + ")");

        }

    }
}
