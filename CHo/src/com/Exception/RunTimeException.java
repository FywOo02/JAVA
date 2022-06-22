package com.Exception;

import java.util.Scanner;

public class RunTimeException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your index");
        int k = s.nextInt();
        try {
            int[] t = {1,2,3,4};
            System.out.println(t[k]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index is out of array");
        }
    }
}
