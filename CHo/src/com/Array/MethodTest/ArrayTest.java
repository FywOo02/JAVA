package com.Array.MethodTest;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of array you want");
        int size = s.nextInt();
        int[] num = new int[size];
        DataImport(num);
        System.out.println("Enter a number you want");
        int num2 = s.nextInt();
        if(DataJudgement(num,num2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void DataImport(int[] arr){
        Scanner s = new Scanner(System.in);
        for(int k = 0; k<arr.length; k++){
            System.out.println("what is the data?");
            arr[k] = s.nextInt();
        }
    }
    public static boolean DataJudgement(int[] a, int b){
        if(b==a[0] || b==a[a.length-1]){
            return true;
        }else{
            return false;
        }
    }
}
