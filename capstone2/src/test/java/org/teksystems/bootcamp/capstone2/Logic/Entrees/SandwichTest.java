package org.teksystems.bootcamp.capstone2.Logic.Entrees;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SandwichTest {

    @Test
    public void testSetBreadTypeRetrunBreadAndPrice() {
        Sandwich sandwich = new Sandwich("","", "", 0);
        sandwich.setBreadType("Plain Bun", 1);

        Assert.assertEquals(sandwich.breadType, "Plain Bun");
        Assert.assertEquals(sandwich.price, 1.0);
    }

    @Test
    public void testSetMeatType() {
        Sandwich sandwich = new Sandwich("","", "", 0);
        sandwich.setMeatType("Brisket", 3);

        Assert.assertEquals(sandwich.meatType, "Brisket");
        Assert.assertEquals(sandwich.price, 3.0);
    }

    @Test
    public void testSetToppingType() {
        Sandwich sandwich = new Sandwich("","", "", 0);
        sandwich.setToppingType("Cheese", 1);

        Assert.assertEquals(sandwich.toppingType.get(1), "Cheese");
        Assert.assertEquals(sandwich.price, 1.0);
    }

    @Test
    public void testGetPrice() {
        Sandwich sandwich = new Sandwich("","", "", 0);
        sandwich.setToppingType("Cheese", 1);
        sandwich.setMeatType("Brisket", 3);
        sandwich.setBreadType("Plain Bun", 1);

        Assert.assertEquals(sandwich.getPrice(), 5.0);
    }

    @Test
    public void testGetSandwich() {
    }
}