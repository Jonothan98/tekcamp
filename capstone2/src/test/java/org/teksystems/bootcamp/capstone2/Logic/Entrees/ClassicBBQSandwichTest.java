package org.teksystems.bootcamp.capstone2.Logic.Entrees;

import org.teksystems.bootcamp.capstone2.Logic.Entrees.ClassicBBQSandwich;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassicBBQSandwichTest {

    @Test
    public void testSetAccessoryReturnStringChips() {
        ClassicBBQSandwich classicBBQSandwich = new ClassicBBQSandwich("");
        classicBBQSandwich.setAccessory("Chips");

        Assert.assertEquals(classicBBQSandwich.accessory, "Chips");
    }

    @Test
    public void testGetSandwichNameReturnsSandwichName() {
        ClassicBBQSandwich classicBBQSandwich = new ClassicBBQSandwich("");

        Assert.assertEquals(classicBBQSandwich.getSandwichName(), "Classic BBQ Sandwich Combo");
    }

    @Test
    public void testGetSandwich() {

    }
}