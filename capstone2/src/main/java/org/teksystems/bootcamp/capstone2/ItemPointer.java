package org.teksystems.bootcamp.capstone2;

public class ItemPointer {

    private String itemName;
    private double itemPrice;

    public ItemPointer(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    String getItemName(){
        return this.itemName;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }
}
