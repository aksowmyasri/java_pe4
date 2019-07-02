package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords sortWords;
    @Before
    public void setUp() throws Exception {
        sortWords = new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        sortWords = null;
    }

    @Test
    public void givenInputStringReturnSortedListOfWords()
    {
        String[] result = sortWords.sortWordsInAlphabeticalOrder("I am a very good girl");
        assertArrayEquals(new String[]{"a","am","girl","good","i","very"},result);
    }
    @Test
    public void givenInputNullReturnNull()
    {
        String[] result = sortWords.sortWordsInAlphabeticalOrder("");
        String[] expected={""};
        assertArrayEquals(expected,result);
    }
    @Test
    public void givenInputNumbersReturnsSortedNumbers()
    {
        String[] result = sortWords.sortWordsInAlphabeticalOrder("5 6 3 2 1");
        assertArrayEquals(new String[]{"1","2","3","5","6"},result);
    }

}