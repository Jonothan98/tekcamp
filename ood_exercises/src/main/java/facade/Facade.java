package facade;

public class Facade {

    public void processOrder(){
        CheckStock check = new CheckStock();
        ProcessingPayment process = new ProcessingPayment();
        PaymentMade madePayment = new PaymentMade();
        ProductShipping shipping = new ProductShipping();
        CompletedPurchase completed = new CompletedPurchase();
        UserInput userInput = new UserInput();

        if(check.checkStock(userInput.userChoice())){
            int cost = process.processingPayment(check.getCost());
            String address = madePayment.paymentMade(cost, check.getItemName());
            shipping.productShipping(address, check.getItemName());
            completed.completedPurchase();
        }
    }
}
