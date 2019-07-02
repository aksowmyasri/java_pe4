package com.stackroute.exercise4;
//Program to replace d with f and l with t in a given Strings
public class ReplaceCharacters
{
    public String replaceCharactersInAString(String inputWord)
    {
        String result="";
        result = inputWord.replaceAll("d","f");
        result = result.replaceAll("l","t");
        return result;
    }
}
