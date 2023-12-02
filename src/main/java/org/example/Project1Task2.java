package org.example;

public class Project1Task2 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even
        //numbers. Develop a program which will identify/print the even numbers
        //only.

        int[] numbers={25,35,60,80,50};

        int sum=0 ;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }



}



