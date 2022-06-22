package com.Array;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //取size与取数
        System.out.println("What is the size of array you need?");
        int size = s.nextInt();

        int[] arr = new int[size];
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Enter your number");
            arr[j] = s.nextInt();
        }
        //建立新数组,并反向遍历数组
        int[] reverseArr = new int[size];
        for (int k = 0; k<size; k++) {
            reverseArr[k]= arr[size-k-1];
        }
        //打印初始数组与反转数组
        System.out.print("The original array is: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("The reverse array is: [");
        for (int a = 0; a < reverseArr.length; a++) {
            if (a == reverseArr.length - 1) {
                System.out.print(reverseArr[a] + "]");
            } else {
                System.out.print(reverseArr[a] + ",");
            }
        }
    }
}
