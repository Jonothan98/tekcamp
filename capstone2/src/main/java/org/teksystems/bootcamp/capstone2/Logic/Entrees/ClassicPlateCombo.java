package org.teksystems.bootcamp.capstone2.Logic.Entrees;

public class ClassicPlateCombo extends Plate{

    String softDrink;

    public ClassicPlateCombo() {
        super("Brisket", "Beans", 6);
        setSideType("Potato Salad", 0);
        this.softDrink = "Soft Drink";
    }

    public String plateComboName(){
        return "Classic Plate Combo";
    }

    @Override
    public void getPlate() {
        System.out.println("Classic Plate Combo");
        super.getPlate();
        System.out.println(" \t w/ "+softDrink);
    }
}
