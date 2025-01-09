package org.luismalamoc;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumAlgorithmTest {

    SumAlgorithm testInstance;

    @Before
    public void setUp() throws Exception {
        testInstance = new SumAlgorithm();
    }

    @Test
    public void testIteration() {
        assertEquals(5050, testInstance.iteration(100));
    }

    @Test
    public void testRecursion() {
        assertEquals(5050, testInstance.recursion(100));
    }
}