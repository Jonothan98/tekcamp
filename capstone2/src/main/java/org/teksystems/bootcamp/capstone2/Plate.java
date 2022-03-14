package org.teksystems.bootcamp.capstone2;

import java.util.ArrayList;

public class Plate {

    private String meatType;
    private ArrayList<String> sideType = new ArrayList<>();
    private double platePrice;

    Plate(String meatType, String sideType, double platePrice){
        this.meatType = meatType;
        this.sideType.add(sideType);
        this.platePrice = platePrice;
    }

    public void setMeatType(String meatType, double platePrice) {
        this.platePrice += platePrice;
        this.meatType = meatType;
    }

    public void setSideType(String sideType, double platePrice){
        this.platePrice += platePrice;
        this.sideType.add(sideType);
    }

    public void getPlate(){
        System.out.println(meatType + ", " + sideType + ", " + platePrice);
    }
}
