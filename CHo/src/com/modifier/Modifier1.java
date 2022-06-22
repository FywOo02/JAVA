package com.modifier;

public class Modifier1 {
    public Modifier1(){
        System.out.println("Modifier1");
    }
    private void show1(){
        System.out.println("private void");
    }
    void show2(){
        System.out.println("void");
    }
    protected void show3(){
        System.out.println("protected void");
    }

    public void main(String[] args){
        Modifier1 s = new Modifier1();
        s.show1();
        s.show2();
        s.show3();
    }
}
