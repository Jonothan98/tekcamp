package org.teksystems.bootcamp.capstone2.Logic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Receipt extends Cart {
    
    public ArrayList<Cart> orders = new ArrayList<>();
    public ArrayList<Date> date = new ArrayList<>();
    public int orderAmount = 0;
    public int orderNumber = 0;


    public void getReceipt(){

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        int numb = this.orderNumber;

        System.out.println("-------------------------RECEIPT--------------------------");
        orders.get(this.orderNumber).getCart();
        System.out.println("               Blazin Bill's BBQ & Firewood");
        System.out.println("                 5710 Britmore Rd. Ste 30");
        System.out.println("                    Houston, TX, 77041");
        System.out.println("                   " + formatter.format(date.get(this.orderNumber)));
        System.out.println("                     Order Number: " + (numb+1));
        System.out.println("---------------------------------------------------------");
    }

    public void setOrders(Cart cart){
        this.orders.add(cart);
        this.date.add(new Date());
        this.orderAmount++;
        this.orderNumber = this.orderAmount-1;
    }

    public void reviewOrders(int orderNumber){
        if(orderNumber > 0 && orderNumber <= this.orderAmount){
            this.orderNumber = orderNumber - 1;
            getReceipt();
        }
    }
}
