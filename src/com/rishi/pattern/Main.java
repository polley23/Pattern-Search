package com.rishi.pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PatternSearchaAlgoFactory patternSearchaAlgoFactory = new PatternSearchaAlgoFactory();
        PatternSearch patternSearch = patternSearchaAlgoFactory.getAlgorithm("KMP");
        System.out.print(patternSearch.search("I am a good boyam","am"));

    }
}
