package org.teksystems.bootcamp.capstone2.MenuItems;

public enum SidesChoice {

    BEANS ("Beans", 1 ),
    POTATOSALAD ("Potato Salad", 1),
    RICE ("Rice", 1),
    GREENBEANS("Green Beans", 1);

    final String sideName;
    final double sidePrice;

    SidesChoice(String sideName, double sidePrice){
        this.sideName = sideName;
        this.sidePrice = sidePrice;
    }

    public String getSideName() {
        return sideName;
    }

    public double getSidePrice() {
        return sidePrice;
    }
}
