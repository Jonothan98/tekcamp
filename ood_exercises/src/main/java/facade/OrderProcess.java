package facade;

public class OrderProcess {

    public boolean checkStock(String itemName){

        if(itemName.contains("toaster")){
            System.out.println(itemName + " Found in stock");
            return true;
        }else{
            System.out.println(itemName + " Out of Stock!");
            return false;
        }
    }

    public int processingPayment(){
        int cost = 20;
        System.out.println("Generating Bill");
        return cost;
    }

    public String paymentMade(int cost){
        System.out.println("Order Summary: Toaster $" + cost);
        System.out.println("Purchase proccesed");
        return "1234 No Where St. Houston, TX";
    }

    public void productShipping(String address){
        System.out.println("Your Toaster will be delivered to " + address);
    }

    public void completedPurchase(){
        System.out.println("Congratulations your Order is complete");
    }

}
