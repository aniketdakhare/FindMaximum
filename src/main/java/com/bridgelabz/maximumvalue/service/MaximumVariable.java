package com.bridgelabz.maximumvalue.service;

public class MaximumVariable
{
    /**
     * METHOD TO FIND OUT MAXIMUM AMONG 3 INTEGERS
     * @param firstNumber takes 1st Integer value
     * @param secondNumber takes 2nd Integer value
     * @param thirdNumber takes 3rd Integer value
     * @return maximum Integer value
     */
    public Integer maximumIntegerValue(Integer firstNumber, Integer secondNumber, Integer thirdNumber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNumber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNumber;
    }

    /**
     * METHOD TO FIND OUT MAXIMUM AMONG 3 FLOAT VALUES
     * @param firstNumber takes 1st Float value
     * @param secondNumber takes 2nd Float value
     * @param thirdNumber takes 3rd Float value
     * @return maximum Float value
     */
    public Float maximumFloatValue(Float firstNumber, Float secondNumber, Float thirdNumber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNumber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNumber;
    }
}
