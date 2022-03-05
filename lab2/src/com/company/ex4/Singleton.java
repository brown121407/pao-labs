package com.company.ex4;

public class Singleton {
     private static Singleton instance;

     private Singleton() {
         System.out.println("Spawning...");
     }

    public static Singleton getInstance() {
         if (instance == null) {
             instance = new Singleton();
         }

        return instance;
    }
}
