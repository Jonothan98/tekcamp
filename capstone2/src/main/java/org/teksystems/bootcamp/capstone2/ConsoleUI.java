package org.teksystems.bootcamp.capstone2;

import org.teksystems.bootcamp.capstone2.Entrees.*;
import org.teksystems.bootcamp.capstone2.MenuItems.*;

import java.util.Scanner;

public class ConsoleUI {

    Cart cart = new Cart();
    Receipt receipt = new Receipt();
    Scanner myScanner = new Scanner(System.in);
    CreateMenu menu = new CreateMenu();


    public void setConsoleUI(){

        boolean userIsActive = true;
        int userDecision;

        while(userIsActive){
            System.out.println("Main Menu: 1.Make Order 2.View Cart 3.View Order History 0.Exit");
            userDecision = myScanner.nextInt();

            if(userDecision == 1){
                System.out.println("1.Sandwich 2.Plate 3.Accessory 0.Main Menu");
                userDecision = myScanner.nextInt();

                if(userDecision == 1){
                    userPicksSandwich();

                } else if(userDecision == 2){
                    userPicksPlate();
                } else if(userDecision == 3){
                    userPicksAccessory();
                }

            } else if(userDecision == 2){
                userViewsCart();
            } else if(userDecision == 3){
                userViewsOrderHistory();
            } else{
                userIsActive = false;
            }
        }

    }

    public void userPicksSandwich(){

        MeatChoice[] meatChoices = MeatChoice.values();
        BreadChoice[] breadChoices = BreadChoice.values();
        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();
        AccessoriesChoice[] accessoriesChoices = AccessoriesChoice.values();

        ClassicBBQSandwich classicBBQSandwich = new ClassicBBQSandwich("");
        TheRegularSandwich theRegularSandwich = new TheRegularSandwich("");

        boolean userIsActive = true;
        int usersDecision;

        while(userIsActive){
            System.out.println("1.Build a Sandwich 2.View Combos 0.Go Back");
            usersDecision = myScanner.nextInt();
            if(usersDecision == 1){
                Sandwich sandwich = new Sandwich(null,null,"", 0);
                menu.presentMeat();
                System.out.println("--------Pick Your meat------------------------");
                usersDecision = myScanner.nextInt();
                sandwich.setMeatType(meatChoices[usersDecision-1].getMeatName(),meatChoices[usersDecision-1].getMeatPrice());

                menu.presentBread();
                System.out.println("--------Pick Your Bread-----------------------");
                usersDecision = myScanner.nextInt();
                sandwich.setBreadType(breadChoices[usersDecision-1].getBreadName(),breadChoices[usersDecision-1].getBreadPrice());

                while(usersDecision != 0){
                    menu.presentToppings();
                    System.out.println("--------Pick Your Toppings or Press 0 to End--------------");
                    usersDecision = myScanner.nextInt();

                    if(usersDecision != 0) {
                        sandwich.setToppingType(toppingsChoices[usersDecision - 1].getToppingName(), toppingsChoices[usersDecision - 1].getToppingPrice());
                    }

                }

                cart.addSandwichToCart(sandwich);
                cart.getTotalPrice(sandwich.getPrice());

            } else if(usersDecision == 2){

                menu.presentSandwichCombos();
                System.out.println("--------Pick Your Combo-----------------------");
                usersDecision = myScanner.nextInt();

                if(usersDecision == 1){
                    menu.presentAccessories();

                    System.out.println("--------Pick Your Accessory----------------");
                    usersDecision = myScanner.nextInt();
                    theRegularSandwich.setAccessory(accessoriesChoices[usersDecision-1].getAccessoryName());

                    cart.addSandwichToCart(theRegularSandwich);
                    cart.getTotalPrice(theRegularSandwich.getPrice());

                } else if (usersDecision == 2){
                    menu.presentAccessories();

                    System.out.println("--------Pick Your Accessory----------------");
                    usersDecision = myScanner.nextInt();
                    classicBBQSandwich.setAccessory(accessoriesChoices[usersDecision-1].getAccessoryName());

                    cart.addSandwichToCart(classicBBQSandwich);
                    cart.getTotalPrice(classicBBQSandwich.getPrice());
                }



            } else {
                userIsActive = false;
            }

        }

    }

    public void userPicksPlate(){
        MeatChoice[] meatChoices = MeatChoice.values();
        SidesChoice[] sidesChoices = SidesChoice.values();

        ClassicPlateCombo classicPlateCombo = new ClassicPlateCombo();
        TheRibCombo theRibCombo = new TheRibCombo();

        boolean userIsActive = true;
        int usersDecision;

        while(userIsActive){
            System.out.println("1.Build a Plate 2.View Combos 0.Go Back");
            usersDecision = myScanner.nextInt();
            if(usersDecision == 1){
                Plate plate = new Plate("","", 0);
                menu.presentMeat();
                boolean pickedMeat = false;
                System.out.println("--------Pick Your meat------------------------");
                while(!pickedMeat) {
                    usersDecision = myScanner.nextInt();
                    if(usersDecision > 0 && usersDecision < meatChoices.length) {
                        plate.setMeatType(meatChoices[usersDecision - 1].getMeatName(), meatChoices[usersDecision - 1].getMeatPrice());
                        pickedMeat = true;
                    } else {
                        System.out.println("Your choice is out of bounds! Try again!");
                    }
                }

                while(usersDecision != 0){
                    menu.presentSides();
                    System.out.println("--------Pick Your Sides or Press 0 to End--------------");
                    usersDecision = myScanner.nextInt();

                    if(usersDecision != 0) {
                        plate.setSideType(sidesChoices[usersDecision - 1].getSideName(), sidesChoices[usersDecision - 1].getSidePrice());
                    }

                }

                cart.addPlateToCart(plate);
                cart.getTotalPrice(plate.getPlatePrice());

            } else if(usersDecision == 2){

                menu.presentPlateCombos();
                System.out.println("--------Pick Your Combo-----------------------");
                usersDecision = myScanner.nextInt();

                if(usersDecision == 1){
                    cart.addPlateToCart(classicPlateCombo);
                    cart.getTotalPrice(classicPlateCombo.getPlatePrice());

                } else if (usersDecision == 2){
                    cart.addPlateToCart(theRibCombo);
                    cart.getTotalPrice(theRibCombo.getPlatePrice());
                }

            } else {
                userIsActive = false;
            }

        }
    }

    public void userPicksAccessory(){

        AccessoriesChoice[] accessoriesChoices = AccessoriesChoice.values();
        int userDecision = 1;

        while(userDecision != 0){
            menu.presentAccessories();
            System.out.println("--------Pick Your Accessory or Enter 0 to End-----------------------");
            userDecision = myScanner.nextInt();
            if(userDecision > 0 && userDecision < accessoriesChoices.length){
                cart.addAccessoryToCart(accessoriesChoices[userDecision-1]);
                cart.getTotalPrice(accessoriesChoices[userDecision-1].getAccessoryPrice());
            }
        }

    }

    public void userViewsCart(){

        Scanner myScanner = new Scanner(System.in);
        int userDecision;
        cart.getCart();
        System.out.println("--------1.Checkout 2.Continue Ordering----------");
        userDecision = myScanner.nextInt();
        if(userDecision == 1){
            receipt.setOrders(cart);
            receipt.getReceipt();
            cart = new Cart();
        }
    }

    public void userViewsOrderHistory(){
        int userDecision;

        System.out.println("Enter Order Number");
        userDecision = myScanner.nextInt();
        if(userDecision > 0 && userDecision < receipt.orderAmount+1) {
            receipt.reviewOrders(userDecision);
        } else {
            System.out.println("Order Not Found. Sent to Main Menu");
        }

    }
}
