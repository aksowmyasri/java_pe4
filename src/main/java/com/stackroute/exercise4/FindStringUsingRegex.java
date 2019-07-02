package com.stackroute.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Program to find Harry in a given string using Regular Expressions
public class FindStringUsingRegex {
    public boolean checkForHarryInTheString(String input)
    {
        boolean check=false;

        Pattern pattern = Pattern.compile("[ a-z]* Harry [A-Za-z ]*");
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
            check=true;
        return check;


    }

}
