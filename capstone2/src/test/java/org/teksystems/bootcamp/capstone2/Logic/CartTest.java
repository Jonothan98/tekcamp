package org.teksystems.bootcamp.capstone2.Logic;

import org.teksystems.bootcamp.capstone2.Logic.Entrees.Plate;
import org.teksystems.bootcamp.capstone2.Logic.Entrees.Sandwich;
import org.teksystems.bootcamp.capstone2.Logic.MenuItems.AccessoriesChoice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest {

    @Test
    public void testAddSandwichToCartArrayHasSandwich() {
        Sandwich sandwich = new Sandwich("","","", 0);
        Cart cart = new Cart();

        cart.addSandwichToCart(sandwich);
        Assert.assertEquals(cart.sandwichInCart.get(0), sandwich);
    }

    @Test
    public void testAddPlateToCartArrayHasPlate() {
        Plate plate = new Plate("", "", 0);
        Cart cart = new Cart();

        cart.addPlateToCart(plate);
        Assert.assertEquals(cart.plateInCart.get(0), plate);
    }

    @Test
    public void testAddAccessoryToCartArrayHasAccessory() {
        AccessoriesChoice[] accessoriesChoice = AccessoriesChoice.values();
        Cart cart = new Cart();

        cart.addAccessoryToCart(accessoriesChoice[0]);
        Assert.assertEquals(cart.accessoriesInCart.get(0), accessoriesChoice[0]);
    }

    @Test
    public void testGetTotalPriceInput2GetPriceandPriceWithTax() {
        Cart cart = new Cart();
        cart.getTotalPrice(1);

        Assert.assertEquals(cart.subTotal, 1);
        Assert.assertEquals(cart.totalPrice, (1*1.0825));
    }

    @Test
    public void testRemoveFromTotalPriceAdd1Remove1NowHas0() {
        Cart cart = new Cart();
        cart.getTotalPrice(1);
        cart.removeFromTotalPrice(1);

        Assert.assertEquals(cart.subTotal, 0);
        Assert.assertEquals(cart.totalPrice, 0);
    }

    @Test
    public void testGetCart() {
    }

    @Test
    public void testRemoveItemFromCart() {
    }
}