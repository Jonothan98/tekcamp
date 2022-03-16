package org.teksystems.bootcamp.capstone2.Logic.Entrees;

import org.teksystems.bootcamp.capstone2.Logic.Entrees.TheRibCombo;
import org.testng.Assert;
import org.testng.annotations.Test;

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