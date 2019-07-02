package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose;
    @Before
    public void setUp() throws Exception {
        stringTranspose  =new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        stringTranspose = null;
    }
    @Test
    public void givenInputStringReturnTransposeOfGivenString()
    {
        String result =stringTranspose.checkStringTranspose("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);

    }
    @Test
    public void givenInputNumberStringReturnTransposeOfGivenNumberString()
    {
        String result =stringTranspose.checkStringTranspose("123 45 65");
        assertEquals("321 54 56",result);

    }
    @Test
    public void givenInputNullReturnNull()
    {
        String result =stringTranspose.checkStringTranspose("");
        assertEquals("",result);

    }
}