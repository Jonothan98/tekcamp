package facade;

public class Facade {

    public void processOrder(String itemName){
        OrderProcess process = new OrderProcess();

        if(process.checkStock(itemName)){
            int cost = process.processingPayment();
            String address = process.paymentMade(cost);
            process.productShipping(address);
            process.completedPurchase();
        }
    }
}
