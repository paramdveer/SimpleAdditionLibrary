package com.sample;

import java.util.HashSet;
import java.util.Set;

public class MaxSubStringFinder {

    public static String getNoDuplicateMaximumSubString(String input){
        Set<Character> seenChars = new HashSet<>();
        int lastNonRepCharIdx = 0;
        String maxSubString = "";
        for(int i=0;i<input.length();i++) {
            char currentchar = input.charAt(i);
            if (seenChars.contains(currentchar)) {
                //TODO: Steps to follow if the repeating character is found
                //If the current non duplicate substring is greater than previous
                if(maxSubString.length()<(i-lastNonRepCharIdx)) {
                    maxSubString = input.substring(lastNonRepCharIdx, i);
                }
                seenChars.remove(currentchar);
                //Rempve those character from the set
                while(input.charAt(lastNonRepCharIdx)!=currentchar){
                    seenChars.remove(input.charAt(lastNonRepCharIdx));
                    lastNonRepCharIdx++;
                }
                lastNonRepCharIdx++;
            }
            seenChars.add(currentchar);
        }
        if(lastNonRepCharIdx==0)
            maxSubString =  input;
        if((input.length()-1-lastNonRepCharIdx)>maxSubString.length()) {
            maxSubString = input.substring(lastNonRepCharIdx);
        }
        return maxSubString;
    }
}
