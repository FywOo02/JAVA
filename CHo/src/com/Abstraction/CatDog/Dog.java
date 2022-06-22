package com.Abstraction.CatDog;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        int i =1;
        System.out.println(i);
    }
}
