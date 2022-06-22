package com.loop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean a= true;
        while(a){
            System.out.println("What is your integer");
            int num = s.nextInt();
            if(num != -99999){
                if(num % 2==0){
                    System.out.println("The integer "+num+" is even number ");
                }else{
                    System.out.println("The integer "+num+" is odd number ");
                }
            }else{
              a = false;
            }
        }
    }
}
