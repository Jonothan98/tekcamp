package facade;

import java.util.ArrayList;
import java.util.Scanner;

public class Facade {

    public void processOrder(){
        CheckStock check = new CheckStock();
        ProcessingPayment process = new ProcessingPayment();
        PaymentMade madePayment = new PaymentMade();
        ProductShipping shipping = new ProductShipping();
        CompletedPurchase completed = new CompletedPurchase();

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
        int userItem = myScanner.nextInt();

        if(check.checkStock(userItem)){
            int cost = process.processingPayment();
            String address = madePayment.paymentMade(cost);
            shipping.productShipping(address);
            completed.completedPurchase();
        }
    }
}
