package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        var evens = new ArrayList<Integer>();
        var odds = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            var x = scanner.nextInt();
            if (x % 2 == 0) {
                evens.add(x);
            } else {
                odds.add(x);
            }
        }

        System.out.println(evens);
        System.out.println(odds);
    }
}
