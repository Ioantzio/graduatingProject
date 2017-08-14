package com.ioantzio.portals.miscellaneous;

import java.util.Random;

public class GenerateRandomNumber
{
    int generatedNumber;
    Random rand;

    public int generateNumber(int lowLimit, int highLimit)
    {
        generatedNumber = rand.nextInt((highLimit-lowLimit)+1) + lowLimit;

        return generatedNumber;
    }
}