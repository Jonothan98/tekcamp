package org.teksystems.bootcamp.capstone2.Logic.MenuItems;

public enum AccessoriesChoice {

    SOFTDRINK("Soft Drink", 1),
    CHIPS("Chips", 1),
    BREAD("Bread", .25),
    JALAPENO("Jalapeno", .25),
    STUFFEDJALAPENO("Stuffed Jalapeno", 1),
    EXTRAMEAT("Extra Meat", 1);

    final String accessoryName;
    final double accessoryPrice;

    AccessoriesChoice(String accessoryName, double accessoryPrice){
        this.accessoryName = accessoryName;
        this.accessoryPrice = accessoryPrice;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public double getAccessoryPrice() {
        return accessoryPrice;
    }
}
