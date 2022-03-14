package org.teksystems.bootcamp.capstone2.Entrees;

public class ClassicBBQSandwich extends Sandwich {

    String softDrink;
    String accessory;


    public ClassicBBQSandwich(String accessory) {
        super("Plain Bun", "Brisket", "BBQ Sauce", 6);
        this.softDrink = "Soft Drink";
        this.accessory = accessory;
    }

    public String getSoftDrink(){
        return softDrink;
    }

    public void setAccessory(String accessory){
        this.accessory = accessory;
    }

    @Override
    public void getSandwich() {
        super.getSandwich();
        System.out.println(" \t w/ "+softDrink +" \n \t w/ " + accessory);

    }
}
