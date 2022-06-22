package com.loop.While;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        //获取用户输入数据
        System.out.println("请输入第一个数字：");
        int num1 = s.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = s.nextInt();

        //判断数字大小
        int bigger =(num1>num2 ? num1:num2);
        int smaller =(num1>num2 ? num2:num1);

        //执行运算循环
        int k = smaller;
        int result = 0;
        while(k<=bigger){
            if(k % 5 == 0){
                result = result + k;
            }
            k++;
        }
        System.out.print("result: "+ result);
    }
}
