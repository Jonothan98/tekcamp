package org.teksystems.bootcamp.capstone2;

import java.util.Scanner;

public class ConsoleUI {


    public void setConsoleUI(){

        Scanner myScanner = new Scanner(System.in);

        MeatChoice[] meatChoices = MeatChoice.values();
        BreadChoice[] breadChoices = BreadChoice.values();
        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();
        Sides[] sides = Sides.values();
        Plate plate = new Plate("","", 0);
        Sandwich sandwich = new Sandwich("","","", 0);

        CreateMenu Menu = new CreateMenu();

    }
}
