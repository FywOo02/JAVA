package com.Collection.Set.TreeSetTest;

public class Student {
    private String Name;
    private int Chinese;
    private int Math;

    public Student(int chinese, int math, String name) {
        Chinese = chinese;
        Math = math;
        Name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public int getSum(){
        return Chinese+Math;
    }
}
