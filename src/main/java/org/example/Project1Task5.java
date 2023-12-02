package org.example;

public class Project1Task5 {
    public static void main(String[] args) {
        // Write a program to swap 2 numbers without a temporary variable?
        int x = 40;
        int y = 65;
        System.out.println("before Swapping");
        System.out.println("value of x is :" + x);
        System.out.println("value of y is :" + y);

        x = x + y;//105
        y = x - y; //40
        x = x - y; //65

        System.out.println("after Swapping");
        System.out.println("value of x is :" + x);
        System.out.println("value of y is :" + y);
    }
}