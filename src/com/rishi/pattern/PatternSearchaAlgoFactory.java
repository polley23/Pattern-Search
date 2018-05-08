package com.rishi.pattern;

public class PatternSearchaAlgoFactory {

    public PatternSearch getAlgorithm(String algo) {
        if (algo.equals("KMP")) {
            return new KMPAlgorithm();
        }
        else if(algo.equals("Finite Automata")){
            return new FiniteAutomataAlgorithm();
        }
        throw new NullPointerException("No Such Algorithm");
    }

}
