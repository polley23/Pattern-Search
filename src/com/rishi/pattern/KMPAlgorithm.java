package com.rishi.pattern;

import java.util.logging.Logger;

public class KMPAlgorithm implements PatternSearch {
    Logger logger = Logger.getLogger("KMPAlgorithm");
    @Override
    public int search(String text, String pattern) {
        logger.info("USING KMP");
        int n = text.length();
        int m = pattern.length();
        int[] lps = new int[m];
        int i=1;
        int len=0;
        int count=0;
        while(i<m){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        i=0;
        int j=0;
        while (i<n){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==m){
                    count++;
                    //System.out.println("Pattern Matched");
                    j=lps[j-1];
                }

            }
            else {
                if(j!=0){
                    j=lps[j-1];
                }
                else {
                    i++;
                }
            }
        }

        return count;
    }
}
