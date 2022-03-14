package org.teksystems.bootcamp.capstone2;


public class App
{
    public static void main( String[] args )
    {
        ConsoleUI consoleUI = new ConsoleUI();

        consoleUI.setConsoleUI();
//        Scanner myScanner = new Scanner(System.in);
//
//        MeatChoice[] meatChoices = MeatChoice.values();
//        BreadChoice[] breadChoices = BreadChoice.values();
//        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();
//        SidesChoice[] sides = SidesChoice.values();
//        Plate plate = new Plate("","", 0);
//        Sandwich sandwich = new Sandwich("","","", 0);
//
//
//        CreateMenu Menu = new CreateMenu();
//
//        Menu.presentMeat();
//        System.out.println("Pick Meat");
//        int userMeat = myScanner.nextInt();
//        sandwich.getMeatType(meatChoices[userMeat - 1].getMeatName(), meatChoices[userMeat - 1].getMeatPrice());
//
//
//        Menu.presentBread();
//        System.out.println("Pick Bread");
//        int userBread = myScanner.nextInt();
//        sandwich.getBreadType(breadChoices[userBread - 1].getBreadName(), breadChoices[userBread - 1].getBreadPrice());
//
//
//        int userToppings = 1;
//        while(userToppings != 0) {
//            Menu.presentToppings();
//            System.out.println("Pick toppings");
//            userToppings = myScanner.nextInt();
//
//            if(userToppings != 0)
//                sandwich.getToppingType(toppingsChoices[userToppings - 1].getToppingName(), toppingsChoices[userToppings - 1].getToppingPrice());
//
//
//        }
//        sandwich.getSandwich();
//
//        System.out.println("--------------Plate-Test--------------------");
//
//        Menu.presentMeat();
//        System.out.println("Pick Meat");
//        userMeat = myScanner.nextInt();
//        plate.setMeatType(meatChoices[userMeat - 1].getMeatName(), meatChoices[userMeat - 1].getMeatPrice());
//
//
//        int userSides = 1;
//        while(userSides != 0){
//            Menu.presentSides();
//            System.out.println("Pick Sides");
//            userSides = myScanner.nextInt();
//
//            if(userSides != 0){
//                plate.setSideType(sides[userSides - 1].getSideName(), sides[userSides - 1].getSidePrice());
//            }
//
//
//        }
//
//        plate.getPlate();
//
    }
}
