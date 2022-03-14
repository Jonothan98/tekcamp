package org.teksystems.bootcamp.capstone2.Entrees;

public class ClassicPlateCombo extends Plate{

    String softDrink;

    public ClassicPlateCombo() {
        super("Brisket", "Beans", 6);
        setSideType("Potato Salad", 0);
        this.softDrink = "Soft Drink";
    }

    @Override
    public void getPlate() {
        super.getPlate();
        System.out.println(" \t w/ "+softDrink);
    }
}
