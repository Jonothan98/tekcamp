package com.teksystems.bootcamp.java_exercises.gridHopper;

public class LocationPointer {
    private int targetX;
    private int targetY;

    public LocationPointer(int targetX, int targetY){
        this.targetX = targetX;
        this.targetY = targetY;
    }

    int getTargetX(){
        return this.targetX;
    }
    int getTargetY(){
        return this.targetY;
    }
}
