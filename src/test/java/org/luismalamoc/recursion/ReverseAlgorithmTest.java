package org.luismalamoc.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAlgorithmTest {

    ReverseAlgorithm testInstance;

    @Before
    public void setUp() throws Exception {
        testInstance = new ReverseAlgorithm();
    }

    @Test
    public void reverse() {
        assertEquals("", testInstance.reverse(""));
        assertEquals("abc", testInstance.reverse("cba"));
        assertEquals("niveK", testInstance.reverse("Kevin"));
    }
}