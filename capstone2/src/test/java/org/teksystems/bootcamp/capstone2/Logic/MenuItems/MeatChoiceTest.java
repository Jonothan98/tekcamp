package org.teksystems.bootcamp.capstone2.Logic.MenuItems;

import org.teksystems.bootcamp.capstone2.Logic.MenuItems.MeatChoice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MeatChoiceTest {

    @Test
    public void testGetMeatNameReturnSausage() {
        MeatChoice[] meatChoices = MeatChoice.values();

        String actual = meatChoices[0].getMeatName();

        Assert.assertEquals(actual, "Sausage");
    }

    @Test
    public void testGetMeatPrice() {
        MeatChoice[] meatChoices = MeatChoice.values();

        double actual = meatChoices[0].getMeatPrice();

        Assert.assertEquals(actual, 5);

    }

    @Test
    public void testValues() {
        MeatChoice[] meatChoices = MeatChoice.values();

        for(MeatChoice meat : meatChoices){
            Assert.assertNotNull(meat.getMeatName());
        }
    }

    @Test
    public void testValueOf() {
        MeatChoice[] meatChoices = MeatChoice.values();

        for(MeatChoice meat : meatChoices){
            Assert.assertNotNull(meat.getMeatPrice());
        }
    }
}