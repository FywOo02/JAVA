package com.computerscience;

public class Jiecheng {
    public static void main(String[] args){
        int result;
        //打字程序
        for(int a=1; a<=10; a++){
            result =1;
            //计算阶乘
            for(int k=1; k<=a; k++) {
                result =result*k;
            }
            System.out.println(a + "!=" + result);
        }
    }
}