package org.teksystems.bootcamp.capstone2.Logic.Entrees;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

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
        BigDecimal platePrice = new BigDecimal(this.platePrice);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        String formattedPrice = format.format(platePrice);
        System.out.println("-" + meatType + " " + formattedPrice);
        for (String s : sideType) {
            if (!s.equals(""))
                System.out.println("\t" + s);
        }
    }
}
