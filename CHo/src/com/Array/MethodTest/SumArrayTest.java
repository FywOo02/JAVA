package com.Array.MethodTest;

import java.util.Scanner;

public class SumArrayTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of first array you want");
        int size1 = s.nextInt();
        int[] arr = new int[size1];
        int sum = SumOfElement(DataImport(arr));
        System.out.println("The sun of all elements is "+sum);
    }
    public static int SumOfElement(int[] x){
        int sum = 0;
        for(int k=0; k<x.length; k++){
            sum = sum+x[k];
        }
        return sum;
    }
    public static int[] DataImport(int[] input){
        Scanner s = new Scanner(System.in);
        for (int k = 0; k < input.length; k++){
            System.out.println("what is the data?");
            input[k] = s.nextInt();
        }
        return input;
    }
}
