package com.Array.MethodTest;

import java.util.Scanner;

public class EvenNumberFinding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of array you want");
        int size = s.nextInt();
        int[] num = new int[size];
        DataPrint(DataImport(num), DataEvenFind(num));
    }
    //Method：data input
    public static int[] DataImport(int[] input) {
        Scanner s = new Scanner(System.in);
        for (int k = 0; k < input.length; k++) {
            System.out.println("what is the data?");
            input[k] = s.nextInt();
        }
        return input;
    }
    //Method: data analyze
    public static int[] DataEvenFind(int[] find) {
        int newSize = 0;
        for (int k = 0; k < find.length; k++) {
            if (find[k] % 2 == 0) {
                newSize++;
            }
        }
        int[] newArr = new int[newSize];
        int i = 0,j = 0;
        for (; j < find.length && i < newSize; j++) {
            if (find[j] % 2 == 0) {
                newArr[i] = find[j];
                i++;
            }
        }
        return newArr;
    }
    //Method: data print
    public static void DataPrint(int[] original, int[] result) {
        System.out.print("The original array is: [");
        for (int i = 0; i < original.length; i++) {
            if (i == original.length - 1) {
                System.out.println(original[i] + "]");
            } else {
                System.out.print(original[i] + ",");
            }
        }
        System.out.print("The result array is: [");
        for (int a = 0; a < result.length; a++) {
            if (a == result.length - 1) {
                System.out.print(result[a] + "]");
            } else {
                System.out.print(result[a] + ",");
            }
        }
    }
}
