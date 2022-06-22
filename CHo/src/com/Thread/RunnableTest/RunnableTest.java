package com.Thread.RunnableTest;

public class RunnableTest implements Runnable {
    private String name;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}