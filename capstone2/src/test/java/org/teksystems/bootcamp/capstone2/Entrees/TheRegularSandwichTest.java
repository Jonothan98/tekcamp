package org.teksystems.bootcamp.capstone2.Entrees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TheRegularSandwichTest {

    @Test
    public void testSetAccessoryReturnChips() {
        TheRegularSandwich theRegularSandwich = new TheRegularSandwich("");
        theRegularSandwich.setAccessory("Chips");

        Assert.assertEquals(theRegularSandwich.accessory, "Chips");
    }

    @Test
    public void testGetSandwichName() {
        TheRegularSandwich theRegularSandwich = new TheRegularSandwich("");

        Assert.assertEquals(theRegularSandwich.getSandwichName(), "The Regular Sandwich Combo");

    }

    @Test
    public void testGetSandwich() {
    }
}