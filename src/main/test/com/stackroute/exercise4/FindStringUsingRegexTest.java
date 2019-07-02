package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindStringUsingRegexTest {
    FindStringUsingRegex findStringUsingRegex;
    @Before
    public void setUp() throws Exception {
        findStringUsingRegex = new FindStringUsingRegex();
    }

    @After
    public void tearDown() throws Exception {
        findStringUsingRegex = null;
    }
    @Test
    public void givenInputStringContainingHarryReturnBooleanTrue()
    {
        assertTrue(findStringUsingRegex.checkForHarryInTheString("This is Harry "));

    }
    @Test
    public void givenInputStringNotContainingHarryReturnBooleanFalse()
    {
        assertFalse(findStringUsingRegex.checkForHarryInTheString("This is Henry "));

    }
    @Test
    public void givenInputStringContainingHarryInAWordReturnBooleanTrue()
    {
        assertFalse(findStringUsingRegex.checkForHarryInTheString("This is HarryPotter"));
    }

}