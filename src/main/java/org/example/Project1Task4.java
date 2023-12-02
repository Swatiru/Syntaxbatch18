package org.example;

public class Project1Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array.
        int[][] numbers = {
                {10, 45, 56, 29},
                {15, 20, 56, 45},
                {20, 30, 39, 67},
        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {


                if (numbers[i][j] % 2 == 0) {
                    sumEven = sumEven + numbers[i][j];
                } else {
                    sumOdd = sumOdd + numbers[i][j];

                }
            }
            System.out.println("sum of even no for array  "+ sumEven);
            System.out.println("sum of odd no for array  "+sumOdd);
        }
    }

}



