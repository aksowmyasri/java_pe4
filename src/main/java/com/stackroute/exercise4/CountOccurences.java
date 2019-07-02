package com.stackroute.exercise4;
//Program to count number of ocuurences of  a character in a given string
public class CountOccurences {
    public String noOfOccurences(String inputWord,char c)
    {
        String result="";
        int count=0;
        for(int i=0;i<inputWord.length();i++) {
            if (inputWord.charAt(i) == c)
                count++;
        }
        if(count>0)
            result= "occurs "+count+" times";
        else
            result="no occurences";

        return result;
    }
}
