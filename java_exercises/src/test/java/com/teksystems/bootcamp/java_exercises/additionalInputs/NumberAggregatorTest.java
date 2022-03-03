package com.teksystems.bootcamp.java_exercises.additionalInputs;


import org.testng.Assert;
import org.testng.annotations.Test;


public class NumberAggregatorTest {

    @Test
    public void testAddNumber5FiveTimesReturns25() {

        NumberAggregator addToTotal = new NumberAggregator();
        addToTotal.addNumber(5);
        addToTotal.addNumber(5);
        addToTotal.addNumber(5);
        addToTotal.addNumber(5);
        addToTotal.addNumber(5);
        Assert.assertEquals(addToTotal.addNumber(0), 25);

    }

    @Test
    public void testAddNumberReturns38() {
        NumberAggregator addToTotal = new NumberAggregator();
        addToTotal.addNumber(4);
        addToTotal.addNumber(9);
        addToTotal.addNumber(6);
        addToTotal.addNumber(12);
        addToTotal.addNumber(7);
        Assert.assertEquals(addToTotal.addNumber(0), 38);

    }

    @Test
    public void testAddNumberReturns20() {
        NumberAggregator addToTotal = new NumberAggregator();
        addToTotal.addNumber(6);
        addToTotal.addNumber(5);
        addToTotal.addNumber(4);
        addToTotal.addNumber(3);
        addToTotal.addNumber(2);
        Assert.assertEquals(addToTotal.addNumber(0), 20);

    }

    @Test
    public void testAddNumberReturns7472() {
        NumberAggregator addToTotal = new NumberAggregator();
        addToTotal.addNumber(4200);
        addToTotal.addNumber(2);
        addToTotal.addNumber(2000);
        addToTotal.addNumber(1200);
        addToTotal.addNumber(70);
        Assert.assertEquals(addToTotal.addNumber(0), 7472);

    }

    @Test
    public void testAddNumberReturns74() {
        NumberAggregator addToTotal = new NumberAggregator();
        addToTotal.addNumber(50);
        addToTotal.addNumber(10);
        addToTotal.addNumber(10);
        addToTotal.addNumber(2);
        addToTotal.addNumber(2);
        Assert.assertEquals(addToTotal.addNumber(0), 74);

    }




}