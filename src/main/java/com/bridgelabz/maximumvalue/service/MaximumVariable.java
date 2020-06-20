package com.bridgelabz.maximumvalue.service;

public class MaximumVariable
{
    /**
     * GENERIC METHOD TO FIND OUT MAXIMUM AMONG 3 VALUES
     * @param firstValue takes 1st value
     * @param secondValue takes 2nd value
     * @param thirdValue takes 3rd value
     * @return maximum value
     */
    public static < T extends Comparable > T maximumValue(T firstValue, T secondValue, T thirdValue)
    {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(thirdValue) > 0 && secondValue.compareTo(firstValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }
}
