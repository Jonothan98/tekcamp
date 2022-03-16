package org.teksystems.bootcamp.capstone2.Logic.Entrees;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Sandwich{

    String breadType;
    String meatType;
    final ArrayList<String> toppingType = new ArrayList<>();
    double price;


    public Sandwich(String breadType, String meatType, String toppingType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.toppingType.add(toppingType);
        this.price = price;
    }

    public void setBreadType(String breadType, double price) {
        this.price += price;
        this.breadType = breadType;
    }

    public void setMeatType(String meatType, double price) {
        this.price += price;
        this.meatType = meatType;
    }

    public void setToppingType(String toppingType, double price) {
        this.price += price;
        this.toppingType.add(toppingType);
    }

    public double getPrice(){
        return price;
    }

    public void getSandwich(){
        BigDecimal sandwichPrice = new BigDecimal(this.price);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        String formattedPrice = format.format(sandwichPrice);
        System.out.println("-" + meatType + " " + formattedPrice);
        System.out.println("\t" + breadType);
        for (String s : toppingType) {
            if (!s.equals(""))
                System.out.println("\t" + s);
        }

    }
}
