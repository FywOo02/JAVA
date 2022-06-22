package com.bio;
import java.util.Scanner;
public class organiccompound {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int k = 1;
        while(k==1){
            System.out.print("what is your grade: ");
            String grade = s.next();
        switch(grade) {
            case "e":
            case "E":
                System.out.println("Excellent");
                break;
            case "g":
            case "G":
                System.out.println("GOOD");
                break;
            case "s":
            case "S":
                System.out.println("satisfactory");
                break;
            case "n":
            case "N":
                System.out.println("Need improve");
                break;
            case "quit":
                k++;
                System.out.println("survey end");
                break;
            default:
                System.out.println("wrong input");
        }
        }
    }
}
