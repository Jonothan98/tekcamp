package org.teksystems.bootcamp.capstone2.Entrees;

public class ClassicBBQSandwich extends Sandwich {

    String softDrink;
    String accessory;


    public ClassicBBQSandwich(String accessory) {
        super("Plain Bun", "Brisket", "BBQ Sauce", 6);
        this.softDrink = "Soft Drink";
        this.accessory = accessory;
    }


    public void setAccessory(String accessory){
        this.accessory = accessory;
    }

    public String getSandwichName(){
        return "Classic BBQ Sandwich Combo";
    }

    @Override
    public void getSandwich() {
        System.out.println("Classic BBQ Sandwich Combo");
        super.getSandwich();
        System.out.println("\t w/ "+softDrink +" \n \t w/ " + accessory);

    }
}
