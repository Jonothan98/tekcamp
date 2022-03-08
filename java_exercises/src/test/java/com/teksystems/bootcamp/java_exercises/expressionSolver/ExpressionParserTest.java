package com.teksystems.bootcamp.java_exercises.expressionSolver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpressionParserTest {

    @Test
    public void testParseExpressionReturn2WithEveryOperation() {

        //1+4*7%3/4*2^2

        Term term = ExpressionParser.ParseExpression("1+4*7%3/4*2^2");

        String expected = "2.0";
        String actual = String.valueOf(term.getValue());
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testParseExpressionReturn27andAHalf() {

        //1+4*7%3/4*2^2

        Term term = ExpressionParser.ParseExpression("1+4*7-3/4*2");

        String expected = "27.5";
        String actual = String.valueOf(term.getValue());
        Assert.assertEquals(actual, expected);

    }
}