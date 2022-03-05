package com.company;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int res = 1;
        while (n > 1) {
            res *= n--;
        }

        return res;
    }
}
