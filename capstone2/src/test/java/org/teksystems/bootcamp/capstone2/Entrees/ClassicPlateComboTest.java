package org.teksystems.bootcamp.capstone2.Entrees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

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