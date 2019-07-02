package com.stackroute.exercise4;

import java.util.Arrays;
import java.util.Locale;
//Program to sort words in a given string in alphabetical order
public class SortWords
{
    public String[] sortWordsInAlphabeticalOrder(String input)
    {
        String[] splitWord = input.toLowerCase(Locale.ENGLISH).split(" ");
        Arrays.sort(splitWord);
        return splitWord;
    }
}
