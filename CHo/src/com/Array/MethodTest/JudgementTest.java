package com.Array.MethodTest;

import java.util.Scanner;

public class JudgementTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of first array you want");
        int size1 = s.nextInt();
        int[] num1 = new int[size1];
        int[] x = DataImport(num1);
        System.out.println("What is the size of second array you want");
        int size2 = s.nextInt();
        int[] num2 = new int[size2];
        int[] y = DataImport(num2);

        if(SameEndOrFirst(x,y)){
            System.out.println("They have same first element or same last element.");
        }else{
            System.out.println("They have distinct first element or distinct last element.");
        }

    }
    //Method：data input
    public static int[] DataImport(int[] input){
        Scanner s = new Scanner(System.in);
        for (int k = 0; k < input.length; k++){
            System.out.println("what is the data?");
            input[k] = s.nextInt();
        }
        return input;
    }
    //Method: judge if they have same first element or last element
    public static boolean SameEndOrFirst(int[]x, int[] y){
        boolean output = true;
        if(x[0] != y[0] && x[x.length-1] != y[y.length-1]){
            output = false;
        }
        return output;
    }
}
