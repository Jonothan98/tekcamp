package org.teksystems.bootcamp.capstone2.MenuItems;

public enum ToppingsChoice {

    CHEESE ("Cheese" , .25),
    JALAPENO("Jalapeno" , .25),
    BBQSAUCE("BBQ Sauce " , .25),
    FRIEDONIONS("Fried Onions" , .25),
    TOMATOES("Tomatoes" , .25),
    PICKLES("Pickles" , .25);

    final String toppingName;
    final double toppingPrice;

    ToppingsChoice(String toppingName, double toppingPrice){

        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    public String getToppingName() {
        return toppingName;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

}
