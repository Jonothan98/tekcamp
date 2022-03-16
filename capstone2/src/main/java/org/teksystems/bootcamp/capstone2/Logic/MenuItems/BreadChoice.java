package org.teksystems.bootcamp.capstone2.Logic.MenuItems;

public enum BreadChoice {

    PLAINBUNS("Plain Buns", 1),
    SESAMESEED("Sesame Seed Buns", 1),
    TOAST("Toast", 1);

    final String breadName;
    final double breadPrice;

    BreadChoice(String breadName, double breadPrice){
        this.breadName = breadName;
        this.breadPrice = breadPrice;
    }

    public String getBreadName() {
        return breadName;
    }

    public double getBreadPrice() {
        return breadPrice;
    }
}
