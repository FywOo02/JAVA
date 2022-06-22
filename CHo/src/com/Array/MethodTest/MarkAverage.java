package com.Array.MethodTest;

import java.util.Scanner;

public class MarkAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of array you want");
        int size1 = s.nextInt();
        int[] arr = new int[size1];
        int[] newIntArr = DataImport(arr);
        double[] result = MarkAverage(newIntArr);
        System.out.print("The result array is: [");
        IntDataPrint(result);
    }

    public static int[] DataImport(int[] input) {
        Scanner s = new Scanner(System.in);
        for (int k = 0; k < input.length; k++) {
            System.out.println("what is the data?");
            input[k] = s.nextInt();
        }
        return input;
    }

    public static void IntDataPrint(double[] original) {
        for (int i = 0; i < original.length; i++) {
            if (i == original.length - 1) {
                System.out.println(original[i] + "]");
            } else {
                System.out.print(original[i] + ",");
            }
        }
    }

    public static double[] MarkAverage(int[] newArr) {
        double[] result = new double[newArr.length/3];
        int i = 0;
        double sum = 0;
        for (int k = 0; k < newArr.length; k++) {
            sum = sum+newArr[k];
            if((k+1)%3 == 0){
                result[i]=sum/3;
                i++;
                sum = 0;
            }
        }
        return result;
    }
}
