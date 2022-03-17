package org.teksystems.bootcamp.capstone2.Logic.MenuItems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SidesChoiceTest {

    @Test
    public void testGetSideNameReturnBeans() {
        SidesChoice[] sidesChoices = SidesChoice.values();

        String actual = sidesChoices[0].getSideName();

        Assert.assertEquals(actual, "Beans");
    }

    @Test
    public void testGetSidePriceReturn1() {
        SidesChoice[] sidesChoices = SidesChoice.values();

        double actual = sidesChoices[0].getSidePrice();

        Assert.assertEquals(actual, 1.0);
    }

    @Test
    public void testValues() {
        SidesChoice[] sidesChoices = SidesChoice.values();

        for(SidesChoice sides: sidesChoices){
            Assert.assertNotNull(sides.sideName);
        }
    }

    @Test
    public void testValueOf() {
        SidesChoice[] sidesChoices = SidesChoice.values();

        for(SidesChoice sides: sidesChoices){
            Assert.assertNotNull(sides.sidePrice);
        }
    }
}