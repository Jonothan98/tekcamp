package org.teksystems.bootcamp.capstone2;

import org.teksystems.bootcamp.capstone2.Logic.Cart;
import org.teksystems.bootcamp.capstone2.Logic.Entrees.*;
import org.teksystems.bootcamp.capstone2.Logic.MenuItems.*;
import org.teksystems.bootcamp.capstone2.Logic.Receipt;

import java.util.Scanner;

public class ConsoleUI {

    Cart cart = new Cart();
    Receipt receipt = new Receipt();
    Scanner myScanner = new Scanner(System.in);
    CreateMenu menu = new CreateMenu();


    public void setConsoleUI(){

        boolean userIsActive = true;
        int userMenuDecision;

        while(userIsActive) {
            System.out.println("Main Menu------------------------- \n1.Make Order \n2.View Cart \n3.View Order History \n-Exit: Any other Number");
            while(!myScanner.hasNextInt()){
                System.out.println("Please Enter a Number!");
                myScanner.next();
            }
            userMenuDecision = myScanner.nextInt();
            switch (userMenuDecision) {
                case 1:
                    System.out.println("Make Order---------------------------\n1.Sandwich \n2.Plate \n3.Accessory \n0.Main Menu");
                    while(!myScanner.hasNextInt()){
                        System.out.println("Please Enter a Number!");
                        myScanner.next();
                    }
                    int userDecision = myScanner.nextInt();
                    switch (userDecision) {
                        case 1:
                            userPicksSandwich();
                            break;
                        case 2:
                            userPicksPlate();
                            break;
                        case 3:
                            userPicksAccessory();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    userViewsCart();
                    break;
                case 3:
                    userViewsOrderHistory();
                    break;
                default:
                    userIsActive = false;
                    break;
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

        boolean userPickedMeat = false;
        boolean userPickedBread = false;
        int usersDecision;

        System.out.println("Sandwich---------------------------\n1.Build a Sandwich \n2.View Combos \n-Back: Any other number");
        while(!myScanner.hasNextInt()){
            System.out.println("Please Enter a Number!");
             myScanner.next();
        }
        usersDecision = myScanner.nextInt();

            switch(usersDecision){
                case 1:
                    Sandwich sandwich = new Sandwich(null,null,"", 0);
                    menu.presentMeat();
                    System.out.println("--------Pick Your meat------------------------");
                    while(!userPickedMeat){
                        while(!myScanner.hasNextInt()){
                            System.out.println("Please Enter a Number!");
                            myScanner.next();
                        }
                        usersDecision = myScanner.nextInt();

                        if(usersDecision > 0 && usersDecision <= meatChoices.length) {
                            sandwich.setMeatType(meatChoices[usersDecision - 1].getMeatName(), meatChoices[usersDecision - 1].getMeatPrice());
                            System.out.println("Added " + meatChoices[usersDecision - 1].getMeatName());
                            userPickedMeat = true;
                        } else{
                            System.out.println("Your choice is out of bounds! Try again!");
                        }
                    }

                    menu.presentBread();
                    System.out.println("--------Pick Your Bread-----------------------");
                    while(!userPickedBread){
                        while(!myScanner.hasNextInt()){
                            System.out.println("Please Enter a Number!");
                            myScanner.next();
                        }
                        usersDecision = myScanner.nextInt();

                        if(usersDecision > 0 && usersDecision <= breadChoices.length) {
                            sandwich.setBreadType(breadChoices[usersDecision - 1].getBreadName(), breadChoices[usersDecision - 1].getBreadPrice());
                            System.out.println("Added " + breadChoices[usersDecision - 1].getBreadName());
                            userPickedBread = true;
                        } else {
                            System.out.println("Your choice is out of bounds! Try again!");
                        }
                    }

                    menu.presentToppings();
                    System.out.println("--------Pick Your Toppings or Press 0 to End--------------");
                    while(usersDecision != 0){
                        while(!myScanner.hasNextInt()){
                            System.out.println("Please Enter a Number!");
                            myScanner.next();
                        }
                        usersDecision = myScanner.nextInt();

                        if(usersDecision > 0 && usersDecision <= toppingsChoices.length) {
                            sandwich.setToppingType(toppingsChoices[usersDecision - 1].getToppingName(), toppingsChoices[usersDecision - 1].getToppingPrice());
                            System.out.println("Added " + toppingsChoices[usersDecision - 1].getToppingName());
                        } else if (usersDecision != 0){
                            System.out.println("Your choice is out of bounds! Try again!");
                        }

                    }

                    System.out.println("Sandwich has been added to Cart!");
                    cart.addSandwichToCart(sandwich);
                    cart.getTotalPrice(sandwich.getPrice());
                    break;
                case 2:
                    menu.presentSandwichCombos();
                    System.out.println("--------Pick Your Combo or any other key to continue-----------------------");
                    while(!myScanner.hasNextInt()){
                        System.out.println("Please Enter a Number!");
                        myScanner.next();
                    }
                    usersDecision = myScanner.nextInt();

                    switch(usersDecision){
                        case 1:
                            menu.presentAccessories();

                            System.out.println("--------Pick Your Accessory----------------");
                            while(!myScanner.hasNextInt()){
                                System.out.println("Please Enter a Number!");
                                myScanner.next();
                            }
                            usersDecision = myScanner.nextInt();
                            theRegularSandwich.setAccessory(accessoriesChoices[usersDecision - 1].getAccessoryName());
                            System.out.println("Added " + theRegularSandwich.getSandwichName());
                            System.out.println("w/" + accessoriesChoices[usersDecision-1].getAccessoryName());

                            cart.addSandwichToCart(theRegularSandwich);
                            cart.getTotalPrice(theRegularSandwich.getPrice());

                            break;

                        case 2:
                            menu.presentAccessories();

                            System.out.println("--------Pick Your Accessory----------------");
                            while(!myScanner.hasNextInt()){
                                System.out.println("Please Enter a Number!");
                                myScanner.next();
                            }
                            usersDecision = myScanner.nextInt();
                            classicBBQSandwich.setAccessory(accessoriesChoices[usersDecision - 1].getAccessoryName());
                            System.out.println("Added " + classicBBQSandwich.getSandwichName());
                            System.out.println("w/" + accessoriesChoices[usersDecision-1].getAccessoryName());

                            cart.addSandwichToCart(classicBBQSandwich);
                            cart.getTotalPrice(classicBBQSandwich.getPrice());
                            break;

                        default:
                            System.out.println("You picked Nothing");
                            break;
                    }
                default:
                    break;
            }
    }

    public void userPicksPlate(){
        MeatChoice[] meatChoices = MeatChoice.values();
        SidesChoice[] sidesChoices = SidesChoice.values();

        ClassicPlateCombo classicPlateCombo = new ClassicPlateCombo();
        TheRibCombo theRibCombo = new TheRibCombo();

        boolean pickedMeat = false;
        int usersDecision;

        System.out.println("Plate---------------------------\n1.Build a Plate \n2.View Combos \n-Back: Any other number");
        while(!myScanner.hasNextInt()){
            System.out.println("Please Enter a Number!");
            myScanner.next();
        }
        usersDecision = myScanner.nextInt();

            switch(usersDecision){
                case 1:
                    Plate plate = new Plate("","", 0);

                    menu.presentMeat();
                    System.out.println("--------Pick Your meat------------------------");
                    while(!pickedMeat) {
                        while(!myScanner.hasNextInt()){
                            System.out.println("Please Enter a Number!");
                            myScanner.next();
                        }
                        usersDecision = myScanner.nextInt();
                        if(usersDecision > 0 && usersDecision <= meatChoices.length) {
                            plate.setMeatType(meatChoices[usersDecision - 1].getMeatName(), meatChoices[usersDecision - 1].getMeatPrice());
                            System.out.println("Added " + meatChoices[usersDecision-1].getMeatName());
                            pickedMeat = true;
                        } else {
                            System.out.println("Your choice is out of bounds! Try again!");
                        }
                    }

                    menu.presentSides();
                    System.out.println("--------Pick Your Sides or Press any other number to end--------------");

                    while(usersDecision != 0){
                        while(!myScanner.hasNextInt()){
                            System.out.println("Please Enter a Number!");
                            myScanner.next();
                        }
                        usersDecision = myScanner.nextInt();

                        if(usersDecision > 0 && usersDecision <= sidesChoices.length) {
                            plate.setSideType(sidesChoices[usersDecision - 1].getSideName(), sidesChoices[usersDecision - 1].getSidePrice());
                            System.out.println("Added " + sidesChoices[usersDecision-1].getSideName());
                        } else if (usersDecision != 0){
                            System.out.println("Your choice is out of bounds! Try again!");
                        }

                    }

                    System.out.println("Plate has been added to Cart!");
                    cart.addPlateToCart(plate);
                    cart.getTotalPrice(plate.getPlatePrice());
                    break;
                case 2:
                    menu.presentPlateCombos();
                    System.out.println("--------Pick Your Combo or Any other number to go back-----------------------");
                    while(!myScanner.hasNextInt()){
                        System.out.println("Please Enter a Number!");
                        myScanner.next();
                    }
                    usersDecision = myScanner.nextInt();
                    switch (usersDecision){
                        case 1:
                            cart.addPlateToCart(classicPlateCombo);
                            cart.getTotalPrice(classicPlateCombo.getPlatePrice());
                            System.out.println("Added " + classicPlateCombo.plateComboName());
                            break;
                        case 2:
                            cart.addPlateToCart(theRibCombo);
                            cart.getTotalPrice(theRibCombo.getPlatePrice());
                            System.out.println("Added " + theRibCombo.plateComboName());
                            break;
                        default:
                            System.out.println("You picked Nothing");
                            break;

                    }
                default:
                    break;

            }
    }

    public void userPicksAccessory(){

        AccessoriesChoice[] accessoriesChoices = AccessoriesChoice.values();
        int userDecision = 1;

        while(userDecision != 0){
            menu.presentAccessories();
            System.out.println("--------Pick Your Accessory or Enter 0 to End-----------------------");
            while(!myScanner.hasNextInt()){
                System.out.println("Please Enter a Number!");
                myScanner.next();
            }
            userDecision = myScanner.nextInt();
            if(userDecision > 0 && userDecision <= accessoriesChoices.length){
                cart.addAccessoryToCart(accessoriesChoices[userDecision-1]);
                cart.getTotalPrice(accessoriesChoices[userDecision-1].getAccessoryPrice());
                System.out.println("Added " + accessoriesChoices[userDecision-1].getAccessoryName());
            } else if(userDecision!= 0){
                System.out.println("Your choice is out of bounds! Try again!");
            }
        }

    }

    public void userViewsCart(){

        int userDecision;
        cart.getCart();
        System.out.println("--------1.Checkout 2.Remove Item From Cart -Any Other Number to Continue Ordering----------");
        while(!myScanner.hasNextInt()){
            System.out.println("Please Enter a Number!");
            myScanner.next();
        }
        userDecision = myScanner.nextInt();
        if(userDecision == 1 && cart.subTotal > 0){
            receipt.setOrders(cart);
            receipt.getReceipt();
            cart = new Cart();
        } else if(userDecision ==1){
            System.out.println("Nothing to Checkout! Sent back to Main Menu");
        } else if(userDecision == 2){
            cart.removeItemFromCart();
        }
    }

    public void userViewsOrderHistory(){
        int userDecision;

        System.out.println("Enter Order Number or 0 to got to Main Menu");
        while(!myScanner.hasNextInt()){
            System.out.println("Please Enter a Number!");
            myScanner.next();
        }
        userDecision = myScanner.nextInt();
        if(userDecision > 0 && userDecision < receipt.orderAmount+1) {
            receipt.reviewOrders(userDecision);
        } else {
            System.out.println("Order Not Found. Sent to Main Menu");
        }

    }
}
