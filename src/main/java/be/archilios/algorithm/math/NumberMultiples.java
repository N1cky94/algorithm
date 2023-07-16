package be.archilios.algorithm.math;

import java.util.*;

public class NumberMultiples {
    private int number;
    private final int[] multiplesOf;
    private Set<Integer> multiples = new TreeSet<>();;
    
    public NumberMultiples(int number, int[] multiplesOf) {
        if (multiplesOf.length == 0) {
            throw new ArithmeticException("Cannot calculate multiples of zero");
        }
        this.number = Math.abs(number);
        this.multiplesOf = multiplesOf;
        calculateMultiples();
    }
    
    private void calculateMultiples() {
        for (int potentialMultiple = 1; potentialMultiple < number; potentialMultiple++) {
            testMultiplicityOf(potentialMultiple);
        }
    }
    
    private void testMultiplicityOf(int potentialMultiple) {
        for (int multipleOf : multiplesOf) {
            if (potentialMultiple % multipleOf == 0) {
                multiples.add(Math.abs(potentialMultiple));
            }
        }
    }
    
    public int getNumber() {
        return number;
    }
    
    public int[] getMultiples() {
        return multiples.stream().mapToInt(i -> i).toArray();
    }
    
    public boolean isMultiple(int number) {
        return multiples.contains(number);
    }
    
    public int sumOfMultiples() {
        return multiples.stream().mapToInt(i -> i).sum();
    }
}
