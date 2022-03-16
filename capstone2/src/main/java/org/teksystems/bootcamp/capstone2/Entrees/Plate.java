package org.teksystems.bootcamp.capstone2.Entrees;

import java.util.ArrayList;

public class Plate {

    String meatType;
    final ArrayList<String> sideType = new ArrayList<>();
    double platePrice;

    public Plate(String meatType, String sideType, double platePrice){
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

    public double getPlatePrice() {
        return platePrice;
    }

    public void getPlate(){
        System.out.println("-" + meatType + " $" + platePrice);
        for (String s : sideType) {
            if (!s.equals(""))
                System.out.println("\t" + s);
        }
    }
}
