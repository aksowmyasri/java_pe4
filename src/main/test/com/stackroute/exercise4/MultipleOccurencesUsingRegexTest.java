package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesUsingRegexTest {
    MultipleOccurencesUsingRegex multipleOccurencesUsingRegex;
    @Before
    public void setUp() throws Exception {
        multipleOccurencesUsingRegex = new MultipleOccurencesUsingRegex();
    }

    @After
    public void tearDown() throws Exception {
        multipleOccurencesUsingRegex = null;
    }
    @Test
    public void givenInputStringAndWordReturnMultipleOcurrencesOfGivenWordInTheString()
    {
        String result = multipleOccurencesUsingRegex.checkMultipleOcuurencesOfAWordInString("She sells seashells by the seashore","se");
        assertEquals("4-6 10-12 27-29",result);
    }
    @Test
    public void givenInputStringAndWordReturnNoOcurrencesOfGivenWordInTheString()
    {
        String result = multipleOccurencesUsingRegex.checkMultipleOcuurencesOfAWordInString("She sells seashells by the seashore","ths");
        assertEquals("",result);
    }
    @Test
    public void givenInputStringAndWordReturnOneOcurrenceOfGivenWordInTheString()
    {
        String result = multipleOccurencesUsingRegex.checkMultipleOcuurencesOfAWordInString("seashore","se");
        assertEquals("0-2",result);
    }
}