package org.luismalamoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialAlgorithmTest {

    public static final int EXPECTED = 24;
    FactorialAlgorithm testInstance;

    @Before
    public void setUp() {
        testInstance = new FactorialAlgorithm();
    }

    @Test
    public void factorialHead() {
        assertEquals(EXPECTED, testInstance.factorialHead(4));
    }

    @Test
    public void factorialTail() {
        assertEquals(EXPECTED, testInstance.factorialTail(4, 1));
    }
}