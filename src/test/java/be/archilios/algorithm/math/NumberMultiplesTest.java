package be.archilios.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberMultiplesTest {
        
        @Test
        void testNumberMultiples() {
            NumberMultiples numbers = new NumberMultiples(10, new int[]{3, 5});
            
            assertEquals(10, numbers.getNumber());
            assertArrayEquals(new int[]{3, 5, 6, 9}, numbers.getMultiples());
            assertTrue(numbers.isMultiple(3));
            assertTrue(numbers.isMultiple(5));
            assertTrue(numbers.isMultiple(6));
            assertTrue(numbers.isMultiple(9));
            assertFalse(numbers.isMultiple(1));
            assertFalse(numbers.isMultiple(2));
            assertFalse(numbers.isMultiple(4));
            assertFalse(numbers.isMultiple(7));
            assertFalse(numbers.isMultiple(8));
            assertEquals(23, numbers.sumOfMultiples());
        }
        
        @Test
        void testNumberMultiplesWithZero() {
            assertThrows(ArithmeticException.class, () -> new NumberMultiples(10, new int[]{0}));
            
        }
        
        @Test
        void testNegativeNumberMultiplesBecomesPositive() {
            NumberMultiples numbers = new NumberMultiples(-10, new int[]{2});
            
            assertEquals(10, numbers.getNumber());
            assertArrayEquals(new int[]{2, 4, 6, 8}, numbers.getMultiples());
        }
        
        @Test
        void testNegativeMultiplesOfBecomesPositive() {
            NumberMultiples numbers = new NumberMultiples(10, new int[]{-2});
            
            assertEquals(10, numbers.getNumber());
            assertArrayEquals(new int[]{2, 4, 6, 8}, numbers.getMultiples());
        }
        
        @Test
        void testNumberMultiplesWithOne() {
            NumberMultiples numbers = new NumberMultiples(10, new int[]{1});
            
            assertEquals(10, numbers.getNumber());
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, numbers.getMultiples());
            assertTrue(numbers.isMultiple(1));
            assertTrue(numbers.isMultiple(2));
            assertTrue(numbers.isMultiple(3));
            assertTrue(numbers.isMultiple(4));
            assertTrue(numbers.isMultiple(5));
            assertTrue(numbers.isMultiple(6));
            assertTrue(numbers.isMultiple(7));
            assertTrue(numbers.isMultiple(8));
            assertTrue(numbers.isMultiple(9));
            assertEquals(45, numbers.sumOfMultiples());
        }
        
        @Test
        void testNumberMultiplesWithNegative() {
            NumberMultiples numbers = new NumberMultiples(10, new int[]{-1});
    
            assertEquals(10, numbers.getNumber());
        }
}