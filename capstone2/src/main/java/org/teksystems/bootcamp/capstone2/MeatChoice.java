package org.teksystems.bootcamp.capstone2;

public enum MeatChoice {
    SAUSAGE("Sausage", 5),
    RIB("Ribs", 6),
    Brisket("Brisket", 6),
    SAUSAGEWRAPPED("Sausage Wrap", 4),
    BOUDIN("Boudin", 5);

    final String meatName;
    final double meatPrice;

    MeatChoice(String meatName, double meatPrice){
        this.meatName = meatName;
        this.meatPrice = meatPrice;
    }

    public String getMeatName() {
        return meatName;
    }
    public double getMeatPrice() {
        return meatPrice;
    }
}
