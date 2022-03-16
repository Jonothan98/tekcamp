package org.teksystems.bootcamp.capstone2.Logic.MenuItems;

import org.teksystems.bootcamp.capstone2.Logic.MenuItems.ToppingsChoice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToppingsChoiceTest {

    @Test
    public void testGetToppingNameReturnsCheese() {
        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();

        String actual = toppingsChoices[0].getToppingName();

        Assert.assertEquals(actual, "Cheese");
    }

    @Test
    public void testGetToppingPriceReturns25Cents() {
        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();

        double actual = toppingsChoices[0].getToppingPrice();

        Assert.assertEquals(actual, .25);
    }

    @Test
    public void testValues() {
        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();

        for(ToppingsChoice topping: toppingsChoices){
            Assert.assertNotNull(topping.toppingName);
        }
    }

    @Test
    public void testValueOf() {
        ToppingsChoice[] toppingsChoices = ToppingsChoice.values();

        for(ToppingsChoice topping: toppingsChoices){
            Assert.assertNotNull(topping.toppingPrice);
        }
    }
}