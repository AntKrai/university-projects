package org.example;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RootsCalculatorTest {

    RootsCalculator rc = new RootsCalculator();
    @Test void infiniteRoots () {
        double a = 0, b = 0, c = 0;
        assertEquals(Arrays.asList(Double.NEGATIVE_INFINITY), rc.calculate_roots(a,b,c));
    }

    @Test void noRoots(){
        double a = 0, b = 0, c = 7;
        assertTrue(rc.calculate_roots(a, b, c).isEmpty());
    }

    @Test void linearEquation(){
        double a = 0, b = 1, c = 6;
        assertEquals(Arrays.asList(-6.0), rc.calculate_roots(a, b, c));    
    }

    @Test void noRoots2(){
        double a = 1, b = 1, c = 7;
        assertTrue(rc.calculate_roots(a, b, c).isEmpty());
    }

    @Test void twoRoots(){
        double a = 1, b = -1, c = -6;
        assertEquals(Arrays.asList(3.0, -2.0), rc.calculate_roots(a, b, c));
    }
    @Test void sameRoots(){
        double a = 1, b = -4, c = 4;
        assertEquals(Arrays.asList(-2.0), rc.calculate_roots(a, b, c));
    }
}
