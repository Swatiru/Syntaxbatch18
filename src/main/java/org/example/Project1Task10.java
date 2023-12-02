package org.example;

public class Project1Task10 {
//Write a program to print out duplicate elements from an Array of Strings?

    public static void main(String[] args) {
        int[] arr= {4,5,4,9,5,8,6};
        System.out.println("Duplicate no in given array");

           for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {

                if(arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                }
            }

        }
    }
}



