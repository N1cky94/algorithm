package be.archilios.algorithm.euler;

import be.archilios.algorithm.math.NumberMultiples;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class ProblemOneTest {
    
    @Test
    void testProblemOneExample() {
        NumberMultiples numbers = new NumberMultiples(10, new int[]{3, 5});
        
        int sum = numbers.sumOfMultiples();
        
        assertEquals(23, sum);
    }
    
    @Test
    void testProblemOneSolution() {
        NumberMultiples numbers = new NumberMultiples(1000, new int[]{3, 5});
    
        int sum = numbers.sumOfMultiples();
        
        assertEquals(233168, sum);
    }
    
}
