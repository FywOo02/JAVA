package com.computerscience;
import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);

        //从用户手中取得两个数
        System.out.print("Type your first integer: ");
        int num1 = s.nextInt();
        System.out.print("Type your second integer: ");
        int num2 = s.nextInt();

        /* 利用三目运算符对数值间进行大小比较 */
        int bigger =(num1>num2 ? num1:num2);
        int smaller =(num1>num2 ? num2:num1);

        //建立for循环求值
        int result =0;
        for(int k=smaller; k<=bigger; k++){
            result +=k;
        }
        //打印输出值
        System.out.println("the value is "+result);
    }
}