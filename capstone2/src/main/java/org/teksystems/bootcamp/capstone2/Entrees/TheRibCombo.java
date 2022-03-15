package org.teksystems.bootcamp.capstone2.Entrees;

public class TheRibCombo extends Plate{

    private final String softDrink;

    public TheRibCombo() {
        super("Ribs", "Beans", 6);
        setSideType("Poatato Salad", 0);
        this.softDrink = "Soft Drink";
    }

    @Override
    public void getPlate() {
        System.out.println("The Rib Plate Combo");
        super.getPlate();
        System.out.println(" \t w/ "+softDrink);
    }
}
