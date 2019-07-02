package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurencesTest {
    CountOccurences countOccurences;
    @Before
    public void setUp() throws Exception {
        countOccurences = new CountOccurences();
    }

    @After
    public void tearDown() throws Exception {
        countOccurences = null;
    }

    @Test
    public void givenInputStringReturnNoOfOccurencesOfTheCharacter()
    {
        String result = countOccurences.noOfOccurences("abaacvbabs",'a');
        assertEquals("occurs 4 times",result);
    }

    @Test
    public void givenInputNumberReturnNoOfOccurencesOfTheNumber()
    {
        String result = countOccurences.noOfOccurences("1213",'1');
        assertEquals("occurs 2 times",result);
    }
    @Test
    public void givenInputStringReturnNoOccurences()
    {
        String result = countOccurences.noOfOccurences("grapes",'c');
        assertEquals("no occurences",result);
    }
}