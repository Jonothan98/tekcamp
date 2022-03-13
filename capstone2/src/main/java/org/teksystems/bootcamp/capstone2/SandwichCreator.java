package org.teksystems.bootcamp.capstone2;

public class SandwichCreator {

    public ItemPointer[] pickSandwichMeat(){
        ItemPointer[] meat = new ItemPointer[5];

        meat[0] = new ItemPointer("Sliced or Chopped Sausage", 5);
        meat[1] = new ItemPointer("Rib", 6);
        meat[2] = new ItemPointer("Brisket and Sausage Mix", 6);
        meat[3] = new ItemPointer("Sausage Wrap", 4);
        meat[4] = new ItemPointer("Boudin", 5);

        return meat;
    }

    public ItemPointer[] pickBread(){
        ItemPointer[] bread = new ItemPointer[3];

        bread[0] = new ItemPointer("Plain Bun", 1);
        bread[1] = new ItemPointer("Sesame Seed", 1);
        bread[2] = new ItemPointer("Toast", 1);

        return bread;
    }

    public ItemPointer[] pickSandwichToppings(){
        ItemPointer[] toppings = new ItemPointer[6];

        toppings[0] = new ItemPointer("Cheese", .25);
        toppings[1] = new ItemPointer("Jalapenos", .25);
        toppings[2] = new ItemPointer("BBQ Sauce", .25);
        toppings[3] = new ItemPointer("Fried Onions", .25);
        toppings[4] = new ItemPointer("Pickles", .25);

        return toppings;
    }

    public ItemPointer[] classicBBQCombo(){

        ItemPointer[] classicBBQ = new ItemPointer[4];

        classicBBQ[0] = new ItemPointer("Brisket", 4);
        classicBBQ[1] = new ItemPointer("Plain Bun", .50);
        classicBBQ[2] = new ItemPointer("Fried Onions", .25);
        classicBBQ[3] = new ItemPointer("BBQ Sauce", .25);

        return classicBBQ;

    }

    public ItemPointer[] classicBurger(){

        ItemPointer[] classicBurger = new ItemPointer[3];

        classicBurger[0] = new ItemPointer("Sausage", 4);
        classicBurger[1] = new ItemPointer("Plain Bun", .25);
        classicBurger[2] = new ItemPointer("BBQ Sauce", .25);

        return classicBurger;
    }


}
