package com.teksystems.bootcamp.java_exercises.gridHopper;

import java.util.Random;

public class BoardGenerator {

    static LocationPointer[][] createBoard( int size, int seed){

        Random r = new Random(seed);
        LocationPointer[][] square = new LocationPointer[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                square[i][j] = new LocationPointer(r.nextInt(size), r.nextInt(size));
            }
        }

        return square;
    }
}
