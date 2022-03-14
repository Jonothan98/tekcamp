package org.teksystems.bootcamp.capstone2;

public enum Sides {

    BEANS ("Beans", 1 ),
    POTATOSALAD ("Potato Salad", 1),
    RICE ("Rice", 1),
    GREENBEANS("Green Beans", 1);

    final String sideName;
    final double sidePrice;

    Sides(String sideName, double sidePrice){
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
