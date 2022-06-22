package com.Collection.List.ListStudentTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("a",20);
        Student s2 = new Student("b",22);
        Student s3 = new Student("c",26);

        list.add(0,s1);
        list.add(1,s2);
        list.add(2,s3);

        for(Student s: list){
            System.out.println(s.getAge()+s.getName());
        }
    }
}
