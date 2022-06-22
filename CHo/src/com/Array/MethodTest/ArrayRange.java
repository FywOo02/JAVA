package com.Array.MethodTest;

import java.util.Scanner;

public class ArrayRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of array you want");
        int size = s.nextInt();
        double[] num = new double[size];
        double[] Array = DataImport(num);
        System.out.println("The range of this array is "+String.format("%.3f",DataRange(Array)));
        System.out.println("The mean of this array is "+String.format("%.3f",DataMean(Array)));
    }

    public static double[] DataImport(double[] input){
        Scanner s = new Scanner(System.in);
        for (int k = 0; k < input.length; k++){
            System.out.println("what is the data?");
            input[k] = s.nextDouble();
        }
        return input;
    }
    public static double DataRange(double[] Array){
        double max = Array[0];
        double min = Array[0];
        for(int i=0; i<Array.length; i++){
            if(max<Array[i]){
                max = Array[i];
            }else if(min>Array[i]){
                min = Array[i];
            }
        }
        double range = max-min;
        return range;
    }
    public static double DataMean(double[] Array){
        double mean = 0.0;
        double sum = 0.0;
        for(int k=0; k<Array.length; k++){
            sum = sum + Array[k];
        }
        mean = sum/Array.length;
        return mean;
    }
}
