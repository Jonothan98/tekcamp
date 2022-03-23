package facade;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    public int userChoice(){
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        itemList.add("Toaster");
        itemList.add("Gum");
        itemList.add("Tires");
        itemList.add("Graphics Cards");

        for(int i = 0; i < itemList.size(); i++){
            System.out.println("Item Number "+ (i+1) + " " + itemList.get(i));
        }
        System.out.println("Enter an Item Number Purchase");

        while(!myScanner.hasNextInt()){
            System.out.println("Please Enter a Number!");
            myScanner.next();
        }
        return myScanner.nextInt();
    }
}
