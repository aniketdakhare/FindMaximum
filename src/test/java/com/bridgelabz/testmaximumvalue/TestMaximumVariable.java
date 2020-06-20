package com.bridgelabz.testmaximumvalue;

import com.bridgelabz.maximumvalue.service.MaximumVariable;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumVariable 
{
    @Test
    public void testWelcomeMasage()
    {
        MaximumVariable maximumVariable = new MaximumVariable();
        String massage = maximumVariable.welcomeMassage("Welcome to find maximum value");
        Assert.assertEquals("Welcome", massage);
    }
}
