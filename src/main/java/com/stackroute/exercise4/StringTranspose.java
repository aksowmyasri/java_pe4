package com.stackroute.exercise4;

import java.util.Locale;
//Program to find transpose of a given string
public class StringTranspose {
    public String checkStringTranspose(String input)
    {
        String result="";
        String[] querySplit = input.toLowerCase(Locale.ENGLISH).split(" ");

        for(int i=0;i<querySplit.length;i++)
        {
            StringBuilder stringBuilder=new StringBuilder(querySplit[i]);
            result=result.concat(" ")+(stringBuilder.reverse());
        }
        return result.trim();
    }
}
