package org.teksystems.bootcamp.capstone2.Entrees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TheRibComboTest {

    @Test
    public void testPlateComboName() {
        TheRibCombo theRibCombo = new TheRibCombo();

        Assert.assertEquals(theRibCombo.plateComboName(), "The Rib Plate Combo");
    }

    @Test
    public void testGetPlate() {
    }
}