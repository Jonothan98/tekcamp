package org.teksystems.bootcamp.capstone2.Logic.MenuItems;

import org.teksystems.bootcamp.capstone2.Logic.MenuItems.BreadChoice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BreadChoiceTest {

    @Test
    public void testGetBreadNameReturnPlainBuns() {
        BreadChoice[] breadChoice = BreadChoice.values();

        String actual = breadChoice[0].getBreadName();

        Assert.assertEquals(actual, "Plain Buns");
    }

    @Test
    public void testGetBreadPriceReturns1() {
        BreadChoice[] breadChoice = BreadChoice.values();

        double actual = breadChoice[0].getBreadPrice();

        Assert.assertEquals(actual, 1);
    }

    @Test
    public void testValuesChecksThatAllEnumsHaveNames() {
        BreadChoice[] breadChoice = BreadChoice.values();

        for(BreadChoice bread : breadChoice){
            Assert.assertNotNull(bread.breadName);
        }

    }

    @Test
    public void testValueOfChecksAllEnumsHavePrice() {
        BreadChoice[] breadChoice = BreadChoice.values();

        for(BreadChoice bread : breadChoice){
            Assert.assertNotNull(bread.breadPrice);
        }
    }
}