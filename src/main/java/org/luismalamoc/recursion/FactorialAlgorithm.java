package org.luismalamoc.recursion;

public class FactorialAlgorithm {

    public int factorialHead(int n) {
        if (n == 0) {
            System.out.println("Base case");
            return 1;
        }
        System.out.println("Before recursion n=" + n);
        int res = n * factorialHead(n - 1);
        System.out.println("After recursion res=" + res);
        return res;
    }

    public int factorialTail(int n, int acc) {
        if (n == 0) {
            System.out.println("Base case acc=" + acc);
            return acc;
        }
        System.out.println("Before recursion n=" + n);
        int res = factorialTail(n - 1, n * acc);
        System.out.println("After recursion res=" + res);
        return res;
    }
}
