package com.Lambda.Add;

public class addDemo {
    public static void main(String[] args) {
        useAdd((x,y)->{
            return x+y;
        });
    }
    public static void useAdd(addable a){
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
