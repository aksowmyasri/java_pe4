package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
    ReplaceCharacters replaceCharacters;
    @Before
    public void setUp() throws Exception {
        replaceCharacters = new ReplaceCharacters();
    }

    @After
    public void tearDown() throws Exception {
        replaceCharacters = null;
    }

    @Test
    public void givenInputStringReturnReplacedString()
    {
        String result = replaceCharacters.replaceCharactersInAString("daily fry");
        assertEquals("faity fry",result);
    }
    @Test
    public void givenInputNumberStringReturnSameString()
    {
        String result = replaceCharacters.replaceCharactersInAString("1234");
        assertEquals("1234",result);
    }
    @Test
    public void givenInputNullReturnNull()
    {
        String result = replaceCharacters.replaceCharactersInAString("");
        assertEquals("",result);
    }

}