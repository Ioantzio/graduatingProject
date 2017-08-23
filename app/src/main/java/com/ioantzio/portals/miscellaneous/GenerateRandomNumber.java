package com.ioantzio.portals.miscellaneous;

import java.util.Random;

public class GenerateRandomNumber
{
    int generatedNumber;
    Random rand;

    /**
     * @param lowLimit The lowest number to be generated
     * @param highLimit The highest number to be generated
     * @return Generates a random number between the lowLimit and the highLimit. If lowLimit is higher than highLimit, returns -1.
     */
    public int generateNumber(int lowLimit, int highLimit)
    {
        if (lowLimit == highLimit)
        {
            return lowLimit;
        } else if (lowLimit > highLimit)
        {
            return -1;
        } else
        {
            rand = new Random();
            generatedNumber = rand.nextInt((highLimit - lowLimit) + 1) + lowLimit;

            return generatedNumber;
        }
    }
}