package org.example;

public class Project1Task8 {
    public static void main(String[] args) {
       // Maximum and minimum number in the array?

        int[] number={30,50,70,20,80};
        int largestNumber=0;
        int lowestNumber=0;
        for(int i=0;i<number.length;i++){
            if(number[i]>largestNumber) {
                largestNumber = number[i];
            }else {
                lowestNumber = number[i];

            }
        }
        System.out.println(largestNumber);
        System.out.println(lowestNumber);
    }
}



