package com.Array.Arraylist;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //取size
        System.out.println("What is the size of array you need?");
        int size = s.nextInt();
        int[] arr = new int[size];
        DataImport(arr);
        DataSearch(arr);
        System.out.println();
    }

    //Method：数据录入
    public static void DataImport(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your number");
            arr[j] = s.nextInt();
        }
    }

    //Method：数据查找
    public static int DataSearch(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which number you are looking for ?");
        int num = s.nextInt();
        //建立index
        int index = 0;
        //遍历数组并查找出符合要求的元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }
}




