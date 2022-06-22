package com.loop.SigmaTest;
import java.util.Scanner;

    public class Sigma {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);

            //获取用户输入数据
            System.out.print("请输入数字：");
            int sum = s.nextInt();

            //循环&计算
            int k = 1;
            int result = 0;

            while(k >= 1){
                result = result + k;
                if(result >= sum){
                    System.out.println("N is "+ k);
                    break;
                }
                    k++;
            }
        }
    }