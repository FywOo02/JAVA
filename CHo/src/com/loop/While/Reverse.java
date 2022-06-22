package com.loop.While;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("enter your number");
        for (int k = arr.length-1; k >= 0; k--) {
            System.out.print(arr[k]);
        }
    }
}
