package org.teksystems.bootcamp.capstone2;

import org.teksystems.bootcamp.capstone2.Entrees.Plate;
import org.teksystems.bootcamp.capstone2.Entrees.Sandwich;
import org.teksystems.bootcamp.capstone2.MenuItems.AccessoriesChoice;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

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

    public void getTotalPrice(double price){
        double foodTax = 1.0825;
        this.subTotal += price;
        totalPrice = foodTax * subTotal;
    }

    public void removeFromTotalPrice(double price){
        double foodTax = 1.0825;
        this.subTotal -= price;
        totalPrice = foodTax * subTotal;
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

    public void removeItemFromCart(){

        Scanner myScanner = new Scanner(System.in);
        int userDecision;

        if(sandwichInCart.size() == 0 && plateInCart.size() == 0 && accessoriesInCart.size() == 0){
            System.out.println("Nothing to Remove, sent back to Main Menu");
        }

        if(sandwichInCart.size() > 0){
            for (int i = 0; i < sandwichInCart.size();i++) {
                System.out.print((i+1)+". ");
                sandwichInCart.get(i).getSandwich();
            }
            System.out.println("Input Sandwich number to remove item or Any other number to move on");
            while(!myScanner.hasNextInt()){
                System.out.println("Please Enter a Number!");
                myScanner.next();
            }
            userDecision = myScanner.nextInt();

            if(userDecision > 0 && userDecision <= sandwichInCart.size()){
                removeFromTotalPrice(sandwichInCart.get(userDecision-1).getPrice());
                sandwichInCart.remove(userDecision-1);
                System.out.println("Item Removed");
            }

        }

        if(plateInCart.size() > 0){
            for (int i = 0; i < plateInCart.size();i++) {
                System.out.print((i+1)+". ");
                plateInCart.get(i).getPlate();
            }

            System.out.println("Input Plate number to remove item or Any other number to move on");
            while(!myScanner.hasNextInt()){
                System.out.println("Please Enter a Number!");
                myScanner.next();
            }
            userDecision = myScanner.nextInt();

            if(userDecision > 0 && userDecision <= plateInCart.size()){
                removeFromTotalPrice(plateInCart.get(userDecision-1).getPlatePrice());
                plateInCart.remove(userDecision-1);
                System.out.println("Item Removed");
            }
        }

        if(accessoriesInCart.size() > 0){
            for(int i = 0; i < accessoriesInCart.size();i++){
                System.out.print((i+1)+". ");
                System.out.println("-" + accessoriesInCart.get(i).getAccessoryName() + "\t$" + accessoriesInCart.get(i).getAccessoryPrice());
            }

            System.out.println("Input Accessory number to remove item or Any other number to move on");
            while(!myScanner.hasNextInt()){
                System.out.println("Please Enter a Number!");
                myScanner.next();
            }
            userDecision = myScanner.nextInt();

            if(userDecision > 0 && userDecision <= accessoriesInCart.size()){
                removeFromTotalPrice(accessoriesInCart.get(userDecision-1).getAccessoryPrice());
                accessoriesInCart.remove(userDecision-1);
                System.out.println("Item Removed");
            }
        }


    }
}
