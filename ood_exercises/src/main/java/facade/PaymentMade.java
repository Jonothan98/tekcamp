package facade;

import java.util.Scanner;

public class PaymentMade {

    public String paymentMade(int cost, String itemName){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Order Summary: "+ itemName + " $" + cost);
        System.out.println("Purchase has been processed");
        System.out.println("-----------------------------\nPlease enter an address for the order to be delivered!");

        return myScanner.nextLine();
    }

}
