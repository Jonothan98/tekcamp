package org.teksystems.bootcamp.capstone2.Logic.Entrees;

public class TheRegularSandwich extends Sandwich{

    String accessory;
    String softDrink;

    public TheRegularSandwich(String accessory) {
        super("Sesame Seed Bun", "Sausage", "Pickles", 6);
        this.accessory = accessory;
        this.softDrink = "Soft Drink";
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getSandwichName(){
        return "The Regular Sandwich Combo";
    }

    @Override
    public void getSandwich() {
        System.out.println("The Regular Sandwich Combo");
        super.getSandwich();
        System.out.println(" \t w/ "+softDrink +" \n \t w/ " + accessory);
    }
}
