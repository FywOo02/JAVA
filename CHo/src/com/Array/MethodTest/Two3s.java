package com.Array.MethodTest;

import java.util.Scanner;

public class Two3s {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of array you want");
        int size = s.nextInt();
        int[] result = MultipleOf3(size);
        PrintData(result);
    }

    public static int[] MultipleOf3(int size) {
        int[] result = new int[size];
        for(int k=0; k<size; k++){
            result[k] = k*3;
        }
        return result;
    }

        public static int[] DataImport(int[] input){
            Scanner s = new Scanner(System.in);
            for (int k = 0; k < input.length; k++) {
                System.out.println("what is the data?");
                input[k] = s.nextInt();
            }
            return input;
        }
        public static void PrintData(int[] arr) {
            System.out.print(" Output array is: [");
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.println(arr[i] + "]");
                } else {
                    System.out.print(arr[i] + ",");
                }
            }
        }
    }

