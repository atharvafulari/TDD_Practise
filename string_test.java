package com.ex.string_tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class string_test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void teststring2chars()
    {
        string_example s=new string_example();
        String temp=s.swapchar("AB");
        assertEquals("BA",temp);
        
    }
}
