package facade;

public class PaymentMade {

    public String paymentMade(int cost){
        System.out.println("Order Summary: Toaster $" + cost);
        System.out.println("Purchase has been processed");
        return "1234 No Where St. Houston, TX";
    }

}
