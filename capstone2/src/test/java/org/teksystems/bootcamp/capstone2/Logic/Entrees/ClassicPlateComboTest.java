package org.teksystems.bootcamp.capstone2.Logic.Entrees;

import org.teksystems.bootcamp.capstone2.Logic.Entrees.ClassicPlateCombo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassicPlateComboTest {

    @Test
    public void testPlateComboNameReturnComboName() {
        ClassicPlateCombo classicPlateCombo = new ClassicPlateCombo();

        Assert.assertEquals(classicPlateCombo.plateComboName(), "Classic Plate Combo");
    }

    @Test
    public void testGetPlate() {

    }
}