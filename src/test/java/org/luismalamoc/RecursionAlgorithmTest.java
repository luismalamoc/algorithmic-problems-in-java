package org.luismalamoc;

import org.junit.Before;
import org.junit.Test;

public class RecursionAlgorithmTest {

    private RecursionAlgorithm testInstance;

    @Before
    public void setUp() {
        testInstance = new RecursionAlgorithm();
    }

    @Test
    public void testHead() {
        testInstance.head(4);
    }

    @Test
    public void testTail() {
        testInstance.tail(4);
    }
}