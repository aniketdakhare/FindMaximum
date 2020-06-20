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
    public void givenMaximumNumberAt_FirstPosition_ReturnsSameNumber()
    {
        Integer maximum = maximumVariable.maximumValue(88, 44, 67);
        Assert.assertEquals((Integer) 88, maximum);
    }
}
