package com.teksystems.bootcamp.java_exercises.gridHopper;

public class BoardHopper {

    public static void main(String[] args) {
        LocationPointer[][] myBoard = BoardGenerator.createBoard(3,3);

        for(int i = 0; i < myBoard.length; i++){
            System.out.println("");
            for(int j = 0; j < myBoard.length; j++){
                System.out.println(myBoard[i][j].getTargetX() + " "+ myBoard[i][j].getTargetY());
            }
        }

        System.out.println("This is the end" + BoardHopper.hop(myBoard).getTargetX() + " " + BoardHopper.hop(myBoard).getTargetY());
    }

    static LocationPointer hop(LocationPointer[][] board){

        int arrayIndexX = 0;
        int arrayIndexY = 0;
        int jumpCounter = 0;
        int pointerX;
        int pointerY;



        while( jumpCounter <= 100 ){

            pointerX = board[arrayIndexX][arrayIndexY].getTargetX();
            pointerY = board[arrayIndexX][arrayIndexY].getTargetY();

            if(pointerX == arrayIndexX && pointerY == arrayIndexY){

                System.out.println("It is equal to itself");
                return new LocationPointer(arrayIndexX,arrayIndexY);

            } else {
                arrayIndexX = pointerX;
                arrayIndexY = pointerY;
//                System.out.println(arrayIndexX + " " + arrayIndexY);
            }

            jumpCounter++;
//            System.out.println(finalPosition.getTargetX());

        }

        return new LocationPointer(arrayIndexX,arrayIndexY);

    }
}
