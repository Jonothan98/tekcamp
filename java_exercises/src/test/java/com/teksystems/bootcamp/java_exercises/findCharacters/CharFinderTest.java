package com.teksystems.bootcamp.java_exercises.findCharacters;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharFinderTest{

    @Test
    public void testFindMatchPositionsInputVehicleAndHello() {

        CharFinder charFinder = new CharFinder();

        HashMap<Character, List<Integer>> expected = new HashMap<Character,List<Integer>>();
        expected.put('v', new ArrayList<Integer>());
        expected.put('e', new ArrayList<Integer>());
        expected.put('h', new ArrayList<Integer>());
        expected.put('i', new ArrayList<Integer>());
        expected.put('c', new ArrayList<Integer>());
        expected.put('l', new ArrayList<Integer>());
        expected.get('e').add(1);
        expected.get('h').add(0);
        expected.get('l').add(2);
        expected.get('l').add(3);

       Assert.assertEquals(charFinder.findMatchPositions("vehicle", "hello"), expected);



    }

    @Test
    public void testFindMatchPositionsInputTestAndPassed() {

        CharFinder charFinder = new CharFinder();

        HashMap<Character, List<Integer>> expected = new HashMap<Character,List<Integer>>();
        expected.put('t', new ArrayList<Integer>());
        expected.put('e', new ArrayList<Integer>());
        expected.put('s', new ArrayList<Integer>());
        expected.put('t', new ArrayList<Integer>());
        expected.get('e').add(4);
        expected.get('s').add(2);
        expected.get('s').add(3);

        Assert.assertEquals(charFinder.findMatchPositions("test", "passed"), expected);



    }

    @Test
    public void testFindMatchPositionsInputJumpAndBump() {

        CharFinder charFinder = new CharFinder();

        HashMap<Character, List<Integer>> expected = new HashMap<Character,List<Integer>>();
        expected.put('j', new ArrayList<Integer>());
        expected.put('u', new ArrayList<Integer>());
        expected.put('m', new ArrayList<Integer>());
        expected.put('p', new ArrayList<Integer>());
        expected.get('u').add(1);
        expected.get('m').add(2);
        expected.get('p').add(3);

        Assert.assertEquals(charFinder.findMatchPositions("jump", "Bump"), expected);

    }

    @Test
    public void testFindMatchPositionsInputBeachAndBasketBall() {

        CharFinder charFinder = new CharFinder();

        HashMap<Character, List<Integer>> expected = new HashMap<Character,List<Integer>>();
        expected.put('b', new ArrayList<Integer>());
        expected.put('e', new ArrayList<Integer>());
        expected.put('a', new ArrayList<Integer>());
        expected.put('c', new ArrayList<Integer>());
        expected.put('h', new ArrayList<Integer>());
        expected.get('b').add(0);
        expected.get('b').add(6);
        expected.get('e').add(4);
        expected.get('a').add(1);
        expected.get('a').add(7);

        Assert.assertEquals(charFinder.findMatchPositions("beach", "basketball"), expected);

    }

    @Test
    public void testFindMatchPositionsInputSleepAndDreams() {

        CharFinder charFinder = new CharFinder();

        HashMap<Character, List<Integer>> expected = new HashMap<Character,List<Integer>>();
        expected.put('s', new ArrayList<Integer>());
        expected.put('l', new ArrayList<Integer>());
        expected.put('e', new ArrayList<Integer>());
        expected.put('p', new ArrayList<Integer>());
        expected.get('s').add(5);
        expected.get('e').add(2);

        Assert.assertEquals(charFinder.findMatchPositions("sleep", "dreams"), expected);



    }
}