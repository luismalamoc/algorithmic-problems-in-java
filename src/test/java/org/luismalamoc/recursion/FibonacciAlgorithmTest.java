package org.luismalamoc.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciAlgorithmTest {

    FibonacciAlgorithm testInstance;

    @Before
    public void setUp() {
        testInstance = new FibonacciAlgorithm();
    }

    @Test
    public void testHead() {
        assertEquals(0, testInstance.head(0));
        assertEquals(1, testInstance.head(1));
        assertEquals(5, testInstance.head(5));
        assertEquals(55, testInstance.head(10));
    }

    @Test
    public void testTail() {
        assertEquals(0, testInstance.tail(0, 0, 1));
        assertEquals(1, testInstance.tail(1, 0, 1));
        assertEquals(5, testInstance.tail(5, 0, 1));
        assertEquals(55, testInstance.tail(10, 0, 1));
    }
}