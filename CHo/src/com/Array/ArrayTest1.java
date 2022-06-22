package com.Array;
import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] mark = new int[6];
        String[] markName ={"first","second","third","forth","fifth","sixth"};
        //取数
        for(int i=0; i<mark.length;i++){
            System.out.println("what is the "+markName[i]+" number");
            mark[i] = s.nextInt();
        }
        //设置初始max与min并取数
        int max = mark[0];
        int min = mark[0];
        for(int j=1; j<mark.length; j++){
            if(mark[j]>max){
                max = mark[j];
            }else if(mark[j]<min){
                min = mark[j];
            }
        }
        System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+min);

        //取平均数
        double sum = 0.0;
        for(int k=0; k<mark.length; k++){
            sum = sum+mark[k];
        }
        System.out.println("The average of this array is "+String.format("%.1f",sum/6));
    }
}

