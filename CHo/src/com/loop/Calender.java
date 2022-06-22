package com.loop;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        //接收数据
        Scanner s = new Scanner(System.in);
        System.out.println("what day is the 1st day");
        String day = s.next();
        System.out.println("How many days are in the month");
        int num = s.nextInt();
        //打印星期
        System.out.println("M\tTU\tW\tTH\tF\tS\tSUN");
        //建立分支语句判断空格数量
        int j = 0;
        switch (day) {
            case "Monday":
                j = 0;
                break;
            case "Tuesday":
                j = 1;
                break;
            case "Wednesday":
                j = 2;
                break;
            case "Thursday":
                j = 3;
                break;
            case "Friday":
                j = 4;
                break;
            case "Saturday":
                j = 5;
                break;
            case "Sunday":
                j = 6;
                break;
        }
        //打印空格
        for(int i = 0; i<j; i++){
            System.out.print("\t");
        }
        //打印日历
        for(int k = 1; k<=num; k++){
            if(j!=0 && k % 7 == (7-j)){
                System.out.println(k+"\t");
            }else if(j==0 && k % 7 == 0){
                System.out.println(k+"\t");
            }else{
                System.out.print(k+"\t");
            }
        }
    }
}