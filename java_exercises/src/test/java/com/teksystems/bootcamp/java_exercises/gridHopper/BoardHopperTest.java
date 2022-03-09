package com.teksystems.bootcamp.java_exercises.gridHopper;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardHopperTest {

    @Test
    public void testHopInput1Return0and0() {

        LocationPointer[][] createBoard = BoardGenerator.createBoard(1,1);

        LocationPointer finalPosition = BoardHopper.hop(createBoard);

        LocationPointer expected = new LocationPointer(0,0);

        Assert.assertEquals(finalPosition.getTargetX(), expected.getTargetX());
        Assert.assertEquals(finalPosition.getTargetY(), expected.getTargetY());
    }

    @Test
    public void testHopInput2Return1and0() {

        LocationPointer[][] createBoard = BoardGenerator.createBoard(2,2);

        LocationPointer finalPosition = BoardHopper.hop(createBoard);

        LocationPointer expected = new LocationPointer(1,0);

        Assert.assertEquals(finalPosition.getTargetX(), expected.getTargetX());
        Assert.assertEquals(finalPosition.getTargetY(), expected.getTargetY());
    }

    @Test
    public void testHopInput3Return2and2() {

        LocationPointer[][] createBoard = BoardGenerator.createBoard(3,3);

        LocationPointer finalPosition = BoardHopper.hop(createBoard);

        LocationPointer expected = new LocationPointer(2,2);

        Assert.assertEquals(finalPosition.getTargetX(), expected.getTargetX());
        Assert.assertEquals(finalPosition.getTargetY(), expected.getTargetY());
    }

    @Test
    public void testHopInput4Return3and1() {

        LocationPointer[][] createBoard = BoardGenerator.createBoard(4,4);

        LocationPointer finalPosition = BoardHopper.hop(createBoard);

        LocationPointer expected = new LocationPointer(3,1);

        Assert.assertEquals(finalPosition.getTargetX(), expected.getTargetX());
        Assert.assertEquals(finalPosition.getTargetY(), expected.getTargetY());
    }
    @Test
    public void testHopInput5Return1and3() {

        LocationPointer[][] createBoard = BoardGenerator.createBoard(5,5);

        LocationPointer finalPosition = BoardHopper.hop(createBoard);

        LocationPointer expected = new LocationPointer(1,3);

        Assert.assertEquals(finalPosition.getTargetX(), expected.getTargetX());
        Assert.assertEquals(finalPosition.getTargetY(), expected.getTargetY());
    }
}