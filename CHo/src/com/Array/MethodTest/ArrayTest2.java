package com.Array.MethodTest;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of array you want");
        int size = s.nextInt();
        int[] num = new int[size];
        DataImport(num);
        if(DataJudgement(num)){
            System.out.println("The first integer is equal to last one.");
        }else{
            System.out.println("The first integer is equal to last one.");
        }
    }

    public static void DataImport(int[] arr){
        Scanner s = new Scanner(System.in);
        for(int k = 0; k<arr.length; k++){
            System.out.println("what is the data?");
            arr[k] = s.nextInt();
        }
    }
    public static boolean DataJudgement(int[] arr){
        if(arr[0]==arr[arr.length-1]){
            return true;
        }else{
            return false;
        }
    }
}
