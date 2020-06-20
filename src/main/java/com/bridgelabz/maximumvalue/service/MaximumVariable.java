package com.bridgelabz.maximumvalue.service;

public class MaximumVariable < T extends Comparable<T> >
{
    T firstValue, secondValue, thirdValue ;

    /**
     * PARAMETERIZED CONSTRUCTOR TO INITIATE VARIABLES
     * @param firstValue takes 1st value
     * @param secondValue takes 2nd value
     * @param thirdValue takes 3rd value
     */
    public MaximumVariable(T firstValue, T secondValue, T thirdValue)
    {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public T maximumValue()
    {
        return MaximumVariable.maximumValue(firstValue, secondValue, thirdValue);
    }

    /**
     * GENERIC METHOD TO FIND OUT MAXIMUM AMONG 3 VALUES
     * @param firstValue takes 1st value
     * @param secondValue takes 2nd value
     * @param thirdValue takes 3rd value
     * @return maximum value
     */
    public static < T extends Comparable<T> > T maximumValue(T firstValue, T secondValue, T thirdValue)
    {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(thirdValue) > 0 && secondValue.compareTo(firstValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }
}