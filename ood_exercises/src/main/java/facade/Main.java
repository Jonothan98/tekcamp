package facade;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Facade facade = new Facade();


        // Only Item in Stock is Toaster
        System.out.println("Enter an Item to Purchase");
        String userItem = myScanner.nextLine();
        facade.processOrder(userItem.toLowerCase(Locale.ROOT));

    }
}
