package com.teksystems.bootcamp.java_exercises.factorByTwo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NodeCreatorTest {

    @Test
    public void testCreateNodeInput4Return2() {

        Node node = NodeCreator.createNode(4);

        Assert.assertEquals(node.getCountOfTwos(), 2);
    }

    @Test
    public void testCreateNodeInput80Return4() {

        Node node = NodeCreator.createNode(80);

        Assert.assertEquals(node.getCountOfTwos(), 4);
    }

    @Test
    public void testCreateNodeInput128Return7() {

        Node node = NodeCreator.createNode(128);

        Assert.assertEquals(node.getCountOfTwos(), 7);
    }

    @Test
    public void testCreateNodeInput5Return0() {

        Node node = NodeCreator.createNode(5);

        Assert.assertEquals(node.getCountOfTwos(), 0);
    }

    @Test
    public void testCreateNodeInput2Return1() {

        Node node = NodeCreator.createNode(2);

        Assert.assertEquals(node.getCountOfTwos(), 1);
    }
}