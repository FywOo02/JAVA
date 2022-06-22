package com.Thread.ThreadTest;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.start();
        my1.join();
        my2.start();
    }
}
