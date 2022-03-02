package com.teksystems.bootcamp.java_exercises.findCharacters;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharFinderTest extends TestCase {

    public void testFindMatchPositions() {

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



        charFinder.findMatchPositions("vehicle", "hello");

        assertEquals(expected, charFinder.findMatchPositions("vehicle", "hello"));



    }
}