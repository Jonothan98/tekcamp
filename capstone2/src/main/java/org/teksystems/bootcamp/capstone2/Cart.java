package org.teksystems.bootcamp.capstone2;

import org.teksystems.bootcamp.capstone2.Entrees.Plate;
import org.teksystems.bootcamp.capstone2.Entrees.Sandwich;
import org.teksystems.bootcamp.capstone2.MenuItems.AccessoriesChoice;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Cart {

    ArrayList<Sandwich> sandwichInCart = new ArrayList<>();
    ArrayList<Plate> plateInCart = new ArrayList<>();
    ArrayList<AccessoriesChoice> accessoriesInCart = new ArrayList<>();
    double subTotal;
    double totalPrice;



    public void addSandwichToCart(Sandwich sandwich){
        this.sandwichInCart.add(sandwich);
    }

    public void addPlateToCart(Plate plate){
        this.plateInCart.add(plate);
    }

    public void addAccessoryToCart(AccessoriesChoice accessory){
        this.accessoriesInCart.add(accessory);
    }

    public double getTotalPrice(double price){
        double foodTax = 1.0825;
        this.subTotal += price;
        totalPrice = foodTax * subTotal;

        return totalPrice;
    }

    public void getCart(){

        BigDecimal bigTotal = new BigDecimal(this.totalPrice);
        BigDecimal subTotal = new BigDecimal(this.subTotal);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        String subtotal= format.format(subTotal);
        String total = format.format(bigTotal);

        System.out.println("-------Cart View-------------------------------------------");
        for (Sandwich sandwich : sandwichInCart) {
            sandwich.getSandwich();
        }

        for (Plate plate : plateInCart) {
            plate.getPlate();
        }

        for(AccessoriesChoice accessory : accessoriesInCart){
            System.out.println("-" + accessory.getAccessoryName() + "\t$" + accessory.getAccessoryPrice());
        }

        System.out.println("-SubTotal: " + subtotal);
        System.out.println("-Total: " + total);
    }

    public void clearCart(){
        this.sandwichInCart.clear();
        this.plateInCart.clear();
        this.accessoriesInCart.clear();
        this.subTotal = 0;
        this.totalPrice = 0;
    }
}
