package com.Array.Arraylist;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class DecimalAdditionTest {
    public static void main(String[] args){
        //创建关于Scanner,Arraylist,DecimalFormat的新的对象
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        DecimalFormat df = new DecimalFormat();

        //定义录入循环变量；
        boolean moreData = true;
        String b;
        //录入循环
        while(moreData){
            System.out.println("Do you have a number to add its reciprocal?");
            b = s.next();
            if(b.equals("yes")){
                System.out.println("What is the number?");
                array.add(s.nextInt());
            }else if(b.equals("no")){
                moreData = false;
            }
        }

        //定义计算循环变量
        double answer = 0;
        String printanswer = "";
        //计算循环
        for(int i=0; i< array.size(); i++){
            answer = answer + 1.0/array.get(i);
            if(i== array.size()-1) printanswer = printanswer + "1/" + array.get(i);
            else printanswer = printanswer + "1/" + array.get(i) + "+";
        }
        df.setMinimumFractionDigits(5);
        System.out.println("The final answer is: "+printanswer+"="+df.format(answer));
        }
    }
