package com.loop.While;
import java.util.Scanner;

public class CalculateTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int k = 1;
        while(k == 1){
            System.out.print("28+35=");
            int result = s.nextInt();
            if(result == 28+35){
                System.out.println("Congratulation,you are right.");
                break;
            }else{
                System.out.println("Answer wrong! Please, enter your answer again");
            }
        }
    }
}
