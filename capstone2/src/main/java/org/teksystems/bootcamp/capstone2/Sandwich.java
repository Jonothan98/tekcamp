package org.teksystems.bootcamp.capstone2;

import java.util.ArrayList;

public class Sandwich{

    private String breadType;
    private String meatType;
    private final ArrayList<String> toppingType = new ArrayList<>();
    private double price;


    public Sandwich(String breadType, String meatType, String toppingType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.toppingType.add(toppingType);
        this.price = price;
    }

    public void getBreadType(String breadType, double price) {
        this.price += price;
        this.breadType = breadType;
    }

    public void getMeatType(String meatType, double price) {
        this.price += price;
        this.meatType = meatType;
    }

    public void getToppingType(String toppingType, double price) {
        this.price += price;
        this.toppingType.add(toppingType);
    }

    public void getSandwich(){
        System.out.println(breadType + " " + meatType + " " + toppingType + " " + price);
    }
}
