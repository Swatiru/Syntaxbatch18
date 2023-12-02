package org.example;

import java.util.Scanner;

public class Project1Task1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        //and then uses a loop to find the highest and lowest temperature for the week.

        double[] temp = new double[7];
          temp[0] = 30;
          temp[1] = 50;
          temp[2] = 45;
          temp[3] = 55;
          temp[4] = 60;
          temp[5] = 70;
          temp[6] = 75;

          double highestTemp=0;
          double lowestTemp=0;
             for(int i=0;i<7;i++){
            if(temp[i]>highestTemp) {
                highestTemp = temp[i];
            }else {
                lowestTemp = temp[i];

            }
        }
        System.out.println("Highest temperature: "+ highestTemp);
        System.out.println("Lowest temperature:"+lowestTemp);
    }
}
