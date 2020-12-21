package com.mycom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        System.out.println("Regular Expression using Java");
        String inputString ="hey  hello 0 1, how subramanian 1 , 7m3";
        // \+d - pattern syntax in regular expression.
        String pattern =  "\\d+";
        System.out.println(pattern);
        //Compile the Pattern
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher digitMatcher =compiledPattern.matcher(inputString);
        System.out.println("Source String "+ inputString);
        while(digitMatcher.find()) {
            System.out.println(digitMatcher.group());
        }

    }
}
