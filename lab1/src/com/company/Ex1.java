package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("n = ");
        var n = scanner.nextInt();

        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
