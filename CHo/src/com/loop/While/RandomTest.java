package com.loop.While;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = (int)(Math.random()*(99)+1);
        int k = 0;
        while(true) {
            k++;
            System.out.print("请输入你的猜测：");
            int i = s.nextInt();
            if (i > num) {
                System.out.println("你猜的数字太大了");
            } else if (i < num) {
                System.out.println("你猜的数字太小了");
            } else {
                System.out.println("你猜中了");
                break;
            }
        }
        System.out.println("你用了"+k+"次尝试");
    }
}
