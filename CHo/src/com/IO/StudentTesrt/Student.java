package com.IO.StudentTesrt;

public class Student {
    private String name;
    private int Chinese;
    private int Math;
    private int English;

    public Student(){
    }
    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    int sum(){
        return this.Chinese+this.Math+this.English;
    }
}
