package com.Arraylist.Studenttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student(20,"a");
        Student s2 = new Student(40,"b");
        Student s3 = new Student(100,"c");
        Student s4 = new Student(90,"g");
        Student s5 = new Student(123,"h");

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);

        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge()-s1.getAge();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        for(Student s: array){
            System.out.println(s.getAge()+","+s.getName());
        }
    }
}
