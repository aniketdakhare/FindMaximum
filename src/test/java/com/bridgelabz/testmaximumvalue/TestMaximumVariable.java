package com.bridgelabz.testmaximumvalue;

import com.bridgelabz.maximumvalue.service.MaximumVariable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumVariable 
{
    MaximumVariable maximumVariable;

    @Before
    public void createObjectOf_MaximumVariableClass()
    {
        maximumVariable = new MaximumVariable();
    }

    @Test
    public void givenMaximumIntegerValueAt_FirstPosition_ReturnsSameNumber()
    {
        Integer maximum = maximumVariable.maximumIntegerValue(88, 44, 67);
        Assert.assertEquals((Integer) 88, maximum);
    }

    @Test
    public void givenMaximumIntegerValueAt_SecondPosition_ReturnsSameNumber()
    {
        Integer maximum = maximumVariable.maximumIntegerValue(88, 99, 67);
        Assert.assertEquals((Integer) 99, maximum);
    }

    @Test
    public void givenMaximumIntegerValueAt_ThirdPosition_ReturnsSameNumber()
    {
        Integer maximum = maximumVariable.maximumIntegerValue(88, 34, 99);
        Assert.assertEquals((Integer) 99, maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_FirstPosition_ReturnsSameNumber()
    {
        Float maximum = maximumVariable.maximumFloatValue(8.8f, 4.4f, 6.7f);
        Assert.assertEquals((Float) 8.8f, maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_SecondPosition_ReturnsSameNumber()
    {
        Float maximum = maximumVariable.maximumFloatValue(8.8f, 9.9f, 6.7f);
        Assert.assertEquals((Float) 9.9f, maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_ThirdPosition_ReturnsSameNumber()
    {
        Float maximum = maximumVariable.maximumFloatValue(8.8f, 3.4f, 9.9f);
        Assert.assertEquals((Float) 9.9f, maximum);
    }
}
