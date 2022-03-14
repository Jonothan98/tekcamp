package org.teksystems.bootcamp.capstone2.MenuItems;

import org.teksystems.bootcamp.capstone2.Entrees.ClassicBBQSandwich;
import org.teksystems.bootcamp.capstone2.Entrees.ClassicPlateCombo;
import org.teksystems.bootcamp.capstone2.Entrees.TheRegularSandwich;
import org.teksystems.bootcamp.capstone2.Entrees.TheRibCombo;

public class CreateMenu {

    public void presentMeat() {

        MeatChoice[] meatChoice = MeatChoice.values();

        System.out.println("------Meat----------------------------------");
        for (int i = 0; i < meatChoice.length; i++) {
            System.out.println(i+1 +" "+meatChoice[i].meatName + "- $" + meatChoice[i].meatPrice);
        }
    }

    public void presentBread(){

        BreadChoice[] breadChoices = BreadChoice.values();

        System.out.println("------Bread-Type----------------------------");
        for (int i = 0; i < breadChoices.length; i++) {
            System.out.println(i+1 +" "+breadChoices[i].breadName + "- $" + breadChoices[i].breadPrice);
        }

    }

    public void presentAccessories(){

        AccessoriesChoice[] accessories = AccessoriesChoice.values();

        System.out.println("------Accessories---------------------------");
        for (int i = 0; i < accessories.length; i++) {
            System.out.println(i+1 +" "+accessories[i].accessoryName + "- $" + accessories[i].accessoryPrice);
        }

    }

    public void presentToppings(){

        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();

        System.out.println("------Toppings---------------------------");
        for (int i = 0; i < toppingsChoices.length; i++) {
            System.out.println(i+1 +" "+toppingsChoices[i].toppingName + "- $" + toppingsChoices[i].toppingPrice);
        }

    }

    public void presentSides(){
        SidesChoice[] sides = SidesChoice.values();

        System.out.println("------Sides-----------------------------");
        for (int i = 0; i < sides.length; i++) {
            System.out.println(i+1 +" "+sides[i].sideName + "- $" + sides[i].sidePrice);
        }
    }

    public void presentSandwichCombos(){
        TheRegularSandwich theRegularSandwich = new TheRegularSandwich("Your choice of Accessory");
        ClassicBBQSandwich classicBBQSandwich = new ClassicBBQSandwich("Your choice of Accessory");

        System.out.println("------Sandwich Combos-------------------");
        System.out.print("1.");theRegularSandwich.getSandwich();
        System.out.print("2.");classicBBQSandwich.getSandwich();
    }

    public void presentPlateCombos(){
        ClassicPlateCombo classicPlateCombo = new ClassicPlateCombo();
        TheRibCombo theRibCombo = new TheRibCombo();

        System.out.println("------Plate Combos---------------------");
        System.out.print("1.");classicPlateCombo.getPlate();
        System.out.print("2.");theRibCombo.getPlate();

    }
}
