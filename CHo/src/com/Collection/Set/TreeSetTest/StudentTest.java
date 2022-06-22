package com.Collection.Set.TreeSetTest;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getSum() - s2.getSum();
                return num;
            }
        });

        Student s1 = new Student (10,20,"a");
        Student s2 = new Student (20,80,"b");
        Student s3 = new Student (30,10,"c");

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for(Student s: ts){
            System.out.println(s.getName()+s.getSum());
        }
    }
}
