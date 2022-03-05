package com.company.ex4;

public class Ex4 {
    public static void main(String[] args) {
        // Prints "Spawning..." only once.
        Singleton.getInstance();
        Singleton.getInstance();
    }
}
