package com.loop.While;

public class Armstrong {
    public static void main(String[] args) {
        int a, b, c, n;
        for (int i = 1; i <= 999; i++){
            //取数
            a = i % 10;
            b = (i / 10)%10;
            c = (i /100)%10;
            n = a*a*a+b*b*b+c*c*c;
            if(n==i){
                System.out.println(i);
            }
        }
    }
}
