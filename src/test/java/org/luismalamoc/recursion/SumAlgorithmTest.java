package org.luismalamoc.recursion;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumAlgorithmTest {

    public static final int EXPECTED = 5050;
    SumAlgorithm testInstance;

    @Before
    public void setUp() throws Exception {
        testInstance = new SumAlgorithm();
    }

    @Test
    public void testIteration() {
        assertEquals(EXPECTED, testInstance.iteration(100));
    }

    @Test
    public void testRecursion() {
        assertEquals(EXPECTED, testInstance.recursion(100));
    }
}