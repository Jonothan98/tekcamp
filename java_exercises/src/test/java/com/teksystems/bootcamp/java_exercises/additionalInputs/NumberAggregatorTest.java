package com.teksystems.bootcamp.java_exercises.additionalInputs;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NumberAggregatorTest extends TestCase {

    private NumberAggregator addToTotal;
    private int inputNumbers1;
    private int inputNumbers2;
    private int inputNumbers3;
    private int inputNumbers4;
    private int inputNumbers5;
    private int expected;

     public NumberAggregatorTest(int inputNumbers1,int inputNumbers2,int inputNumbers3,int inputNumbers4,int inputNumbers5, int expected){

        this.inputNumbers1 = inputNumbers1;
        this.inputNumbers2 = inputNumbers2;
        this.inputNumbers3 = inputNumbers3;
        this.inputNumbers4 = inputNumbers4;
        this.inputNumbers5 = inputNumbers5;
        this.expected = expected;

    }

    public void TestCase(){

    }

    @org.junit.Before
    public void setup(){
        addToTotal = new NumberAggregator();
        System.out.println("running Test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][] {
                {8, 9, 5, 4, 3, 29 },
                {4, 9, 6, 12, 7, 38},
                {6, 5, 4, 3, 2, 20},
                {2, 3, 4, 5, 6, 20},
                {4200, 2, 2000, 1200, 70, 7472}
        });
    }

    @org.junit.Test
    public void testAddNumber() {
        addToTotal.addNumber(inputNumbers1);
        addToTotal.addNumber(inputNumbers2);
        addToTotal.addNumber(inputNumbers3);
        addToTotal.addNumber(inputNumbers4);
        addToTotal.addNumber(inputNumbers5);
        assertEquals(expected, addToTotal.addNumber(0));

    }


}