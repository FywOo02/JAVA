package com.Array.MethodTest;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of first array you want");
        int size1 = s.nextInt();
        int[] arr = new int[size1];
        int[] newIntArr = DataImport(arr);
        String[] StringArr = DataConvert(newIntArr);
        System.out.print("The original array is: [");
        IntDataPrint(newIntArr);
        System.out.print("The new array is: [");
        CharDataPrint(StringArr);
    }

    public static int[] DataImport(int[] input) {
        Scanner s = new Scanner(System.in);
        for (int k = 0; k < input.length; k++) {
            System.out.println("what is the data?");
            input[k] = s.nextInt();
        }
        return input;
    }

    public static String[] DataConvert(int[] arr) {
        String[] newArr = new String[arr.length];
        for (int k = 0; k < arr.length; k++) {
            switch(arr[k]){
                case 1:
                    newArr[k] = "Monday";
                    break;
                case 2:
                    newArr[k] = "Tuesday";
                    break;
                case 3:
                    newArr[k] = "Wednesday";
                    break;
                case 4:
                    newArr[k] = "Thursday";
                    break;
                case 5:
                    newArr[k] = "Friday";
                    break;
                case 6:
                    newArr[k] = "Saturday";
                    break;
                case 7:
                    newArr[k] = "Sunday";
                    break;
                default:
                    System.out.println("Wrong number");

            }
        }
        return newArr;
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
    public static void CharDataPrint(String[] result){
        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                System.out.println(result[i] + "]");
            } else {
                System.out.print(result[i] + ",");
            }
        }
    }
}
