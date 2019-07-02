package com.stackroute.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Program to find Multiple Occurences of a Given word in a String using Regular Expressions
public class MultipleOccurencesUsingRegex {
    public String checkMultipleOcuurencesOfAWordInString(String input,String word)
    {
        String result="";
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {

            result = result + matcher.start() + "-" + matcher.end()+" ";
        }



        return result.trim();
    }
}
