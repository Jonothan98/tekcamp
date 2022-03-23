package facade;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckStockTest {

    @Test
    public void testCheckStockInput1and2ReturnTrueInput3and4ReturnFalse() {
        CheckStock checkStock = new CheckStock();

        boolean Input1 = checkStock.checkStock(1);
        boolean Input2 = checkStock.checkStock(2);
        boolean Input3 = checkStock.checkStock(3);
        boolean Input4 = checkStock.checkStock(4);

        Assert.assertTrue(Input1);
        Assert.assertTrue(Input2);
        Assert.assertFalse(Input3);
        Assert.assertFalse(Input4);

    }

    @Test
    public void testGetCost() {
        CheckStock checkStock = new CheckStock();

        checkStock.checkStock(1);

        int actual = checkStock.getCost();

        Assert.assertEquals(actual, 20);

    }

    @Test
    public void testGetItemName() {
        CheckStock checkStock = new CheckStock();

        checkStock.checkStock(1);

        String actual = checkStock.getItemName();

        Assert.assertEquals(actual, "Toaster");
    }
}