package com.Array.MethodTest;

import java.util.Scanner;

public class Print8Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of first array you want");
        int size1 = s.nextInt();
        int[] arr = new int[size1];
        int[] newIntArr = DataImport(arr);
        int[] result = DataCovert(newIntArr);
        System.out.print("The original array is: [");
        IntDataPrint(newIntArr);
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
    public static int[] DataCovert(int[] arr){
        int[] result = new int[arr.length];
        int j = 0;
        for(int k=0; k< arr.length; k++){
            if(arr[k]==8){
                for(; k<arr.length; k++){
                    result[j]=arr[k];
                    j++;
                }
                for(int x = 0; x<k && j< arr.length; x++){
                    result[j]=arr[x];
                    j++;
                }
            }
        }
        return result;
    }
    public static void IntDataPrint(int[] original) {
        for (int i = 0; i < original.length; i++) {
            if (i == original.length - 1) {
                System.out.println(original[i] + "]");
            } else {
                System.out.print(original[i] + ",");
            }
        }
    }
}
