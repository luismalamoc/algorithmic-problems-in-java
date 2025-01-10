package org.luismalamoc;

public class RecursionAlgorithm {

    public void head(int n) {
        System.out.println("Calling the function with n=" + n);
        if (n == 0) return;
        head(n - 1);
        System.out.println("The value n=" + n);
    }

    public void tail(int n) {
        System.out.println("Calling the function with n=" + n);
        if (n == 0) return;
        System.out.println("The value n=" + n);
        tail(n - 1);
    }
}
