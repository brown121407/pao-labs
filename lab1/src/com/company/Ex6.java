package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var sum = 0;
        var n = 0;

        while (true) {
            var x = scanner.nextInt();
            if (x == -1) {
                break;
            }
            sum += x;
            n++;
        }

        System.out.println(sum / n);
    }
}
