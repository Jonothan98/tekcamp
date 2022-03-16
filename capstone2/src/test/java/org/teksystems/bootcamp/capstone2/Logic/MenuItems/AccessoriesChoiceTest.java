package org.teksystems.bootcamp.capstone2.Logic.MenuItems;

import org.teksystems.bootcamp.capstone2.Logic.MenuItems.AccessoriesChoice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessoriesChoiceTest {

    @Test
    public void testGetAccessoryNameReturnSoftDrink() {
        AccessoriesChoice[] accessoriesChoices = AccessoriesChoice.values();

        String actual = accessoriesChoices[0].getAccessoryName();

        Assert.assertEquals(actual, "Soft Drink");
    }

    @Test
    public void testGetAccessoryPriceReturn25Cents() {
        AccessoriesChoice[] accessoriesChoices = AccessoriesChoice.values();

        double actual = accessoriesChoices[2].getAccessoryPrice();

        Assert.assertEquals(actual, .25);
    }

    @Test
    public void testValuesMakesSureEveryEnumHasName() {
        AccessoriesChoice[] accessoriesChoice = AccessoriesChoice.values();

        for (AccessoriesChoice choice : accessoriesChoice) {
            Assert.assertNotNull(choice.accessoryName);
        }
    }

    @Test
    public void testValueOfMakesSureEveryEnumHasPrice() {

        AccessoriesChoice[] accessoriesChoice = AccessoriesChoice.values();

        for (AccessoriesChoice choice : accessoriesChoice) {
            Assert.assertNotNull(choice.accessoryPrice);
        }
    }
}