package org.teksystems.bootcamp.capstone2.Entrees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlateTest {

    @Test
    public void testSetMeatTypeReturnBrisketAndPrice() {
        Plate plate = new Plate("","", 0);
        plate.setMeatType("Brisket", 5);

        Assert.assertEquals(plate.meatType, "Brisket" );
        Assert.assertEquals(plate.platePrice, 5);
    }

    @Test
    public void testSetSideType() {
        Plate plate = new Plate("","", 0);
        plate.setSideType("Beans", 5);

        Assert.assertEquals(plate.sideType.get(1), "Beans" );
        Assert.assertEquals(plate.platePrice, 5);

    }

    @Test
    public void testGetPlatePriceReturns10() {
        Plate plate = new Plate("","", 0);
        plate.setSideType("Beans", 5);
        plate.setMeatType("Brisket", 5);

        Assert.assertEquals(plate.getPlatePrice(), 10);
    }

    @Test
    public void testGetPlate() {

    }
}