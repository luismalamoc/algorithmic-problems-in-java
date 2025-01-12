package org.luismalamoc.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TowersOfHanoiAlgorithmTest {

    TowersOfHanoiAlgorithm testInstance;

    @Before
    public void setUp() {
        testInstance = new TowersOfHanoiAlgorithm();
    }

    @Test
    public void solve() {
        testInstance.solve(2, 'A', 'B', 'C');
    }
}