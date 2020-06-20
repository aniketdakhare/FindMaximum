package com.bridgelabz.testmaximumvalue;

import com.bridgelabz.maximumvalue.service.MaximumVariable;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumVariable 
{
    @Test
    public void givenMaximumIntegerValueAt_FirstPosition_ReturnsSameNumber()
    {
        Integer maximum = new MaximumVariable<>(88, 44, 67).maximumValue();
        Assert.assertEquals((Integer) 88, maximum);
    }

    @Test
    public void givenMaximumIntegerValueAt_SecondPosition_ReturnsSameNumber()
    {
        Integer maximum = new MaximumVariable<>(88, 99, 67).maximumValue();
        Assert.assertEquals((Integer) 99, maximum);
    }

    @Test
    public void givenMaximumIntegerValueAt_ThirdPosition_ReturnsSameNumber()
    {
        Integer maximum = new MaximumVariable<>(88, 44, 99).maximumValue();
        Assert.assertEquals((Integer) 99, maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_FirstPosition_ReturnsSameValue()
    {
        Float maximum = new MaximumVariable<>(8.8f, 4.4f, 6.7f).maximumValue();
        Assert.assertEquals((Float) 8.8f, maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_SecondPosition_ReturnsSameValue()
    {
        Float maximum = new MaximumVariable<>(2.8f, 8.4f, 6.7f).maximumValue();
        Assert.assertEquals((Float) 8.4f, maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_ThirdPosition_ReturnsSameValue()
    {
        Float maximum = new MaximumVariable<>(8.8f, 4.4f, 9.9f).maximumValue();
        Assert.assertEquals((Float) 9.9f, maximum);
    }

    @Test
    public void givenMaximumStringValueAt_FirstPosition_ReturnsSameValue()
    {
        String maximum = new MaximumVariable<>("Peach", "Apple", "Banana").maximumValue();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenMaximumStringValueAt_SecondPosition_ReturnsSameValue()
    {
        String maximum = new MaximumVariable<>("Apple", "Peach", "Banana").maximumValue();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenMaximumStringValueAt_ThirdPosition_ReturnsSameValue()
    {
        String maximum = new MaximumVariable<>("Apple", "Banana", "Peach").maximumValue();
        Assert.assertEquals("Peach", maximum);
    }
}