package com.bridgelabz.maximumvalue.service;

public class MaximumVariable
{

    public int maximumValue(Integer firstNumber, Integer secondNumber, Integer thirdNumber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNumber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNumber;
    }
}
