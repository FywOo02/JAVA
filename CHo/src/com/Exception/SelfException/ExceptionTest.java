package com.Exception.SelfException;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) throws ScoreException {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your score");
        int t = s.nextInt();
        Teacher test = new Teacher();
        test.checkScore(t);
    }
}
