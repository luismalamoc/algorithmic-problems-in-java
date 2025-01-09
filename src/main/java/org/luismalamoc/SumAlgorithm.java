package org.luismalamoc;

import java.util.concurrent.ThreadLocalRandom;

public class SumAlgorithm {

    public int iteration(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public int recursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursion(n - 1);
    }


}
