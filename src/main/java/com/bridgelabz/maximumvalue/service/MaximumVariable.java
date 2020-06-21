package com.bridgelabz.maximumvalue.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximumVariable < E extends Comparable<E> >
{
    List<E> values ;

    /**
     * PARAMETERIZED CONSTRUCTOR TO INITIATE LIST
     * @param values takes the values
     */
    public MaximumVariable(List<E> values)
    {
        this.values = values;
    }

    public E maximumValue()
    {
       return maximumValue(values);
    }

    /**
     * GENERIC METHOD TO FIND OUT MAXIMUM AMONG THE VALUES IN ARRAY
     * @param values takes the values
     * @param <E> specifies type of object for generic method
     * @return maximum value
     */
    public static < E extends Comparable<E> > E maximumValue(List<E> values )
    {
        Optional<E> maximum = values.stream().max(Comparable::compareTo);
        printMaximumValue(values,maximum.get());
        return maximum.get();
    }

    public static <E> void printMaximumValue(List<E> values, E max)
    {
        System.out.println("Maximum value out of "+ values+" is "+max);
    }
}