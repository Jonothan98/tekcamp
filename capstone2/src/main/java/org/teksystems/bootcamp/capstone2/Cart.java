package org.teksystems.bootcamp.capstone2;

import org.teksystems.bootcamp.capstone2.Entrees.Plate;
import org.teksystems.bootcamp.capstone2.Entrees.Sandwich;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Cart {

    ArrayList<Sandwich> sandwichInCart = new ArrayList<>();
    ArrayList<Plate> plateInCart = new ArrayList<>();
    double subTotal;
    double totalPrice;



    public void addSandwichToCart(Sandwich sandwich){
        this.sandwichInCart.add(sandwich);
    }

    public void addPlateToCart(Plate plate){
        this.plateInCart.add(plate);
    }

    public double getTotalPrice(double price){
        double foodTax = 1.0825;
        this.subTotal += price;
        totalPrice = foodTax * subTotal;

        return totalPrice;
    }

    public void getCart(){

        BigDecimal bigDecimal = new BigDecimal(totalPrice);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        String total = format.format(bigDecimal);

        System.out.println("-------Cart View-------------------------------------------");
        for (Sandwich sandwich : sandwichInCart) {
            sandwich.getSandwich();
        }

        for (Plate plate : plateInCart) {
            plate.getPlate();
        }

        System.out.println("-SubTotal: " + subTotal);
        System.out.println("-Total: " + total);
    }

    public void clearCart(){
        this.sandwichInCart.clear();
        this.plateInCart.clear();
        this.subTotal = 0;
        this.totalPrice = 0;
    }
}
