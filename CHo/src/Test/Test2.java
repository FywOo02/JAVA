package Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first mass?");
        int first = sc.nextInt();
        System.out.println("What is the second mass?");
        int second = sc.nextInt();
        System.out.println("What is the third mass?");
        int third = sc.nextInt();
        System.out.println("What is the fourth mass?");
        int fourth = sc.nextInt();
        System.out.println("What is the fifth mass?");
        int fifth = sc.nextInt();
        int ave = averageMass(first,second,third,fourth,fifth);
        print(first,second,third,fourth,fifth,ave);
    }
    public static int averageMass(int a,int b, int c,int d,int e){
        int ave = (a+b+c+d+e)/5;
        return ave;
    }
    public static void print(int a,int b, int c,int d,int e,int ave){
        System.out.println("Mass#1: "+a+"g");
        System.out.println("Mass#2: "+b+"g");
        System.out.println("Mass#3: "+c+"g");
        System.out.println("Mass#4: "+d+"g");
        System.out.println("Mass#5: "+e+"g");
        System.out.println("Average Mass: "+ave+"g");
    }
}
