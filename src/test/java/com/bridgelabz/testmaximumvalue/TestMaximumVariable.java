package com.bridgelabz.testmaximumvalue;

import com.bridgelabz.maximumvalue.service.MaximumVariable;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumVariable 
{
    @Test
    public void givenMaximumIntegerValueAt_FirstPosition_ReturnsSameNumber()
    {
       Integer maximum = new MaximumVariable<>(34,56,22,4,67,90,95,2).maximumValue();
        Assert.assertEquals((Integer) 95, maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_FirstPosition_ReturnsSameValue()
    {
        Float maximum = new MaximumVariable<>(2.4f,5.6f,9.7f,0.4f,7.7f,4.5f).maximumValue();
        Assert.assertEquals((Float) 9.7f, maximum);
    }

    @Test
    public void givenMaximumStringValueAt_FirstPosition_ReturnsSameValue()
    {
        String maximum = new MaximumVariable<>("Apple","Peach","Snake","Banana","Horse").maximumValue();
        Assert.assertEquals("Snake", maximum);
    }
}