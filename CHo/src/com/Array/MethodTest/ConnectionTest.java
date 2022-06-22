package com.Array.MethodTest;

import java.util.Scanner;

public class ConnectionTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of first array you want");
        int size1 = s.nextInt();
        int[] num1 = new int[size1];
        DataImport(num1);
        System.out.println("What is the size of second array you want");
        int size2 = s.nextInt();
        int[] num2 = new int[size2];
        DataImport(num2);
        int[] NewArray = NewArray(num1, num2);
        ArrayPrint(NewArray);
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
    //Method: Generate a new array
    public static int[] NewArray(int[] a, int[] b){
        int x =0;
        int[] newArray = new int[a.length+ b.length];
        for(int j=0; j<a.length; j++){
            newArray[j] = a[j];
        }
        for(int i=a.length; i< a.length + b.length && x< b.length; i++){
            newArray[i] = b[x];
            x++;
        }
        return newArray;
    }
    //Method: Array Print
    public static void ArrayPrint(int[] newArray) {
        System.out.print("After connecting, the new array is: [");
        for (int i = 0; i < newArray.length; i++) {
            if (i == newArray.length - 1) {
                System.out.println(newArray[i] + "]");
            } else {
                System.out.print(newArray[i] + ",");
            }
        }
    }
}
