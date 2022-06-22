package com.Abstraction.CatDog;

public class AnimalTest {
    public static void main(String[] args){
        Animal c = new Cat();
        Animal d = new Dog();
        c.setAge(10);
        c.setName("Catty");
        c.eat();
        d.setAge(11);
        d.setName("Puppy");
        d.eat();
    }
}
