package com.Thread.RunnableTest;

public class Test {
    public static void main(String[] args) {
        RunnableTest test = new RunnableTest();
        Thread t1 = new Thread("飞机");
        Thread t2 = new Thread("火车");
        t1.start();
        t2.start();

    }
}
