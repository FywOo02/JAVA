package com.loop.While;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("How many terms you want?");
        int ele = s.nextInt();
        int i, a=0, b=1;
        for(i=0;i<=ele;i++){
            System.out.print(" "+a+" "+b);
            a=a+b;
            b=b+a;
        }
    }
}
