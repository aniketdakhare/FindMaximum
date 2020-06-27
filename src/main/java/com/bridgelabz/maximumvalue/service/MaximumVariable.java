package com.bridgelabz.maximumvalue.service;

import java.util.Arrays;

public class MaximumVariable <T>
{
    T[] values ;

    /**
     * PARAMETERIZED CONSTRUCTOR TO INITIATE ARRAY
     * @param values takes the values
     */
    @SafeVarargs
    public MaximumVariable(T ... values)
    {
        this.values = values;
    }

    public T maximumValue()
    {
       return maximumValue(values);
    }

    /**
     * GENERIC METHOD TO FIND OUT MAXIMUM AMONG THE VALUES IN ARRAY
     * @param values takes the values
     * @param <T> specifies type of object for generic method
     * @return maximum value
     */
    @SafeVarargs
    public static <T> T maximumValue(T ... values )
    {
        Arrays.sort(values);
        printMaximumValue(values[values.length - 1], Arrays.toString(values));
        return values[values.length - 1];
    }

    public static <E> void printMaximumValue(E max, E values)
    {
        System.out.println("Maximum value out of " + values + " is " + max);
    }
}