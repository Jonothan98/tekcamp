package com.teksystems.bootcamp.java_exercises.gridHopper;

public class BoardHopper {

    static LocationPointer hop(LocationPointer[][] board){

        int arrayIndexX = 0;
        int arrayIndexY = 0;
        int jumpCounter = 0;
        int pointerX;
        int pointerY;

        while( jumpCounter <= 100){

            pointerX = board[arrayIndexX][arrayIndexY].getTargetX();
            pointerY = board[arrayIndexX][arrayIndexY].getTargetY();

            if(pointerX == arrayIndexX && pointerY == arrayIndexY){
                return new LocationPointer(arrayIndexX,arrayIndexY);
            }

            arrayIndexX = pointerX;
            arrayIndexY = pointerY;

            jumpCounter++;

        }

        return new LocationPointer(arrayIndexX,arrayIndexY);

    }
}
