package com.Array.MethodTest;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of first array you want");
        int size1 = s.nextInt();
        double[] arr = new double[size1];
        double sum = SumOfElement(DataImport(arr));
        System.out.println("The sum of all elements is "+sum);
    }
    public static double[] DataImport(double[] input){
        Scanner s = new Scanner(System.in);
        for (int k = 0; k < input.length; k++){
            System.out.println("what is the data?");
            input[k] = s.nextDouble();
        }
        return input;
    }
    public static double SumOfElement(double[] arr){
        double result = 0.0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>200 || arr[i]<0){
                result = result;
            }else{
                result = result + arr[i];
            }
        }
        return result;
    }
}
