package com.loop.While;
import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0, countEven = 0, countOdd = 0, countPos = 0, countNeg = 0, sum = 0, sumEven = 0, sumOdd = 0, sumPos = 0, sumNeg = 0;
        System.out.println("please, enter your number");
        int num = s.nextInt();
        while (num != -999999) {
            count++;
            sum = sum + num;
            if (num > 0) {
                countPos++;
                sumPos += num;
            } else {
                countNeg++;
                sumNeg += num;
            }
            if (num % 2 == 0) {
                countEven++;
                sumEven += num;
            } else {
                countOdd++;
                sumOdd += num;
            }
            System.out.println("please, enter your number");
            num = s.nextInt();
        }
        double average = sum / count;
        double aveEven = sumEven / countEven;
        double aveOdd = sumOdd / countOdd;
        double avePos = sumPos / countPos;
        double aveNeg = sumNeg / countNeg;
        System.out.println("Average is "+ average);
        System.out.println("Average of even number is " + aveEven);
        System.out.println("Average of odd number is "+ aveOdd);
        System.out.println("Average of positive number is "+ avePos);
        System.out.println("Average of negative number is " + aveNeg);
    }
}

