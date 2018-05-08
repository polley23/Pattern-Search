package com.rishi.pattern;

import java.util.logging.Logger;

public class KMPAlgorithm implements PatternSearch {
    Logger logger = Logger.getLogger("KMPAlgorithm");git
    @Override
    public Boolean search(String text, String pattern) {
        logger.info("USING KMP");
        int n = text.length();
        int m = pattern.length();
        int[] lps =
        return false;
    }
}
