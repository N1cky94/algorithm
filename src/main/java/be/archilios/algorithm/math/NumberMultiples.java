package be.archilios.algorithm.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberMultiples {
    private int number;
    private final int[] multiplesOf;
    private final List<Integer> multiples;
    
    public NumberMultiples(int number, int[] multiplesOf) {
        this.number = number;
        this.multiplesOf = multiplesOf;
        multiples = calculateMultiples();
    }
    
    private List<Integer> calculateMultiples() {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            for (int multipleOf : multiplesOf) {
                if (i % multipleOf == 0) {
                    multiples.add(i);
                }
            }
        }
        return multiples;
    }
    
    public int getNumber() {
        return number;
    }
    
    public int[] getMultiples() {
        return multiples.stream().mapToInt(i -> i).toArray();
    }
    
    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     * The sum of these multiples is 23.
     *
     * Find the sum of all the multiples of 3 or 5 below 1000.
     *
     * SPAGHETTI APROACH
     *
     */
    public static void main(String[] args) {
        NumberMultiples number = new NumberMultiples(10, new int[]{3, 5});
        int sum = Arrays.stream(number.getMultiples()).sum();
    
        System.out.println("sum should be 23 = " + sum);
        
        number = new NumberMultiples(1000, new int[]{3, 5});
        int sum2 = Arrays.stream(number.getMultiples()).sum();
    
        System.out.println("sum should be 233168 = " + sum2);
    }
}
