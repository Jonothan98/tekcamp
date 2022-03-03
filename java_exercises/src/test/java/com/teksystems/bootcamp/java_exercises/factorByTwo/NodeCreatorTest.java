package com.teksystems.bootcamp.java_exercises.factorByTwo;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NodeCreatorTest {

    @Test
    public void testCreateNodeTest1() {

        Node node = NodeCreator.createNode(4);

        Assert.assertEquals(node.getCountOfTwos(), 2);
    }

    @Test
    public void testCreateNodeTest2() {

        Node node = NodeCreator.createNode(80);

        Assert.assertEquals(node.getCountOfTwos(), 4);
    }

    @Test
    public void testCreateNodeTest3() {

        Node node = NodeCreator.createNode(128);

        Assert.assertEquals(node.getCountOfTwos(), 7);
    }

    @Test
    public void testCreateNodeTest4() {

        Node node = NodeCreator.createNode(5);

        Assert.assertEquals(node.getCountOfTwos(), 0);
    }

    @Test
    public void testCreateNodeTest5() {

        Node node = NodeCreator.createNode(2);

        Assert.assertEquals(node.getCountOfTwos(), 1);
    }
}