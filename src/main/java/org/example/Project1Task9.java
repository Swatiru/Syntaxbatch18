package org.example;

public class Project1Task9 {
    //Write a java program to find the second largest number in the array?
             public static void main(String[] args) {
                int[] a = {20, 15, 60, 78, 89};

                int temp;
                for (int i = 0; i < a.length; i++) {
                    for (int j = i + 1; j < a.length; j++) {

                        if (a[i] < a[j]) {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;

                        }
                    }
                }
                System.out.println(a[1]);
              }}