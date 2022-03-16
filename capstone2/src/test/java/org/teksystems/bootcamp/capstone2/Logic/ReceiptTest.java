package org.teksystems.bootcamp.capstone2.Logic;

import org.teksystems.bootcamp.capstone2.Logic.Entrees.Sandwich;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReceiptTest {

    @Test
    public void testGetReceipt() {
    }

    @Test
    public void testSetOrdersAddCartCheckThatItWasAddCorrectly() {
        Receipt receipt = new Receipt();
        Cart cart = new Cart();
        Sandwich sandwich = new Sandwich("","","", 0);
        cart.addSandwichToCart(sandwich);
        receipt.setOrders(cart);
        Assert.assertEquals(receipt.orders.get(0), cart);
    }

    @Test
    public void testReviewOrders() {
    }
}