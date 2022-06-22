package com.BranchStatement;
import java.util.Scanner;

    public class SwitchTest {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("请输入你的成绩: ");
            int mark = s.nextInt();
            if(mark<0 || mark>100){
                System.out.println("输入成绩有误");
            }
            switch(mark/10){
                case 9:
                    System.out.println("Excellent");
                    break;
                case 8:
                    System.out.println("good");
                    break;
                case 7:
                    System.out.println("you need to study harder");
                    break;
                case 6:
                    System.out.println("you might need help");
                    break;
                case 5:
                    System.out.println("you might consider to drop this course");
                    break;
                default:
                    System.out.println("you don't need to take this course more");
            }
        }
    }
