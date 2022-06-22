package com.BranchStatement;
import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("请输入你的成绩: ");
        int mark = s.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("you are excellent");
        }else if(mark>=80){
            System.out.println("you are good");
        }else if(mark>=70){
            System.out.println("you need to study harder");
        }else if(mark>=60){
            System.out.println("you might need help");
        }else if(mark>=50){
            System.out.println("you might consider drop this course");
        }else{
            System.out.println("you are not ready to take this course");
        }
    }
}
