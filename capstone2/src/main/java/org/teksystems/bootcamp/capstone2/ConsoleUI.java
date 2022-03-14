package org.teksystems.bootcamp.capstone2;

import org.teksystems.bootcamp.capstone2.Entrees.ClassicBBQSandwich;
import org.teksystems.bootcamp.capstone2.Entrees.Plate;
import org.teksystems.bootcamp.capstone2.Entrees.Sandwich;
import org.teksystems.bootcamp.capstone2.Entrees.TheRegularSandwich;
import org.teksystems.bootcamp.capstone2.MenuItems.*;

import java.util.Scanner;

public class ConsoleUI {


    public void setConsoleUI(){

        Scanner myScanner = new Scanner(System.in);

        AccessoriesChoice[] accessoriesChoices = AccessoriesChoice.values();
        SidesChoice[] sides = SidesChoice.values();
        Plate plate = new Plate("","", 0);
        ClassicBBQSandwich classicBBQSandwich = new ClassicBBQSandwich("");
        TheRegularSandwich theRegularSandwich = new TheRegularSandwich("");

        boolean userIsActive = true;
        int userDecision;

        System.out.println("1.Make Order 2.Review Order History");
        userDecision = myScanner.nextInt();

        while(userIsActive){
            if(userDecision == 1){
                System.out.println("1.Sandwich 2.Plate");
                userDecision = myScanner.nextInt();

                if(userDecision == 1){
                    userPicksSandwich();
                } else {
                    userIsActive =false;
                }


            } else if(userDecision == 2){

            } else{
                userIsActive = false;
            }
        }

    }

    public void userPicksSandwich(){

        Scanner myScanner = new Scanner(System.in);
        MeatChoice[] meatChoices = MeatChoice.values();
        BreadChoice[] breadChoices = BreadChoice.values();
        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();
        Sandwich sandwich = new Sandwich(null,null,"", 0);
        CreateMenu Menu = new CreateMenu();
        boolean userIsActive = true;
        int usersDecision;

        while(userIsActive){
            System.out.println("1.Build a Sandwich 2.View Combos 0.Go Back");
            usersDecision = myScanner.nextInt();
            if(usersDecision == 1){
                Menu.presentMeat();
                System.out.println("--------Pick-Your-meat------------------------");
                usersDecision = myScanner.nextInt();
                sandwich.setMeatType(meatChoices[usersDecision-1].getMeatName(),meatChoices[usersDecision-1].getMeatPrice());

                Menu.presentBread();
                System.out.println("--------Pick-Your-Bread-----------------------");
                usersDecision = myScanner.nextInt();
                sandwich.setBreadType(breadChoices[usersDecision-1].getBreadName(),breadChoices[usersDecision-1].getBreadPrice());

                while(usersDecision != 0){
                    Menu.presentToppings();
                    System.out.println("--------Pick-Your-Toppings-or-Press-0-to-End--------------");
                    usersDecision = myScanner.nextInt();

                    if(usersDecision != 0)
                        sandwich.setToppingType(toppingsChoices[usersDecision-1].getToppingName(),toppingsChoices[usersDecision-1].getToppingPrice());
                }

                sandwich.getSandwich();

            } else if(usersDecision == 2){
                Menu.presentSandwichCombos();

            } else {
                userIsActive = false;
            }

        }

    }
}
