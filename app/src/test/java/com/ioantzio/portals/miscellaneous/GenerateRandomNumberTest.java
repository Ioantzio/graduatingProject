package com.ioantzio.portals.miscellaneous;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GenerateRandomNumberTest
{
    private int lowLimit;
    private int highLimit;
    private int result;

    private GenerateRandomNumber generator;

    @Before
    public void initializeVariables()
    {
        lowLimit = 4;
        highLimit = 10;
        generator = new GenerateRandomNumber();
    }

    @Test
    public void generateRandomNumber() throws Exception
    {
        result = generator.generateNumber(lowLimit, highLimit);
        assertTrue("Error! Greater than high limit", result <= highLimit);
        assertTrue("Error! Less than low limit", result >= lowLimit);
    }

    @After
    public void nullifyVariables()
    {
        generator = null;
    }
}