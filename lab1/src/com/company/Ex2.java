package com.company;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("a = ");
        var a = scanner.nextInt();
        System.out.print("b = ");
        var b = scanner.nextInt();

        if (a != b) {
            System.out.println((a > b ? "a" : "b") + " este mai mare.");
        } else {
            System.out.println("a și b sunt egale.");
        }
    }
}
