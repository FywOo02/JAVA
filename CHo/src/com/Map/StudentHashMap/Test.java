package com.Map.StudentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //创建HashMap对象
        Map<Student,Integer> map = new HashMap<Student,Integer>();
        //创建学生类对象
        Student s1 = new Student(10,"a");
        Student s2 = new Student(11,"ss");
        Student s3 = new Student(12,"b");
        Student s4 = new Student(15,"mk");
        Student s5 = new Student(16,"c");
        //传入数据
        map.put(s1,001);
        map.put(s2,002);
        map.put(s3,003);
        map.put(s4,004);
        map.put(s5,005);

        Set<Student> keySet = map.keySet();
        for(Student key: keySet){
            Integer s = map.get(key);
            System.out.println(s+ key.getAge()+key.getName());
        }
    }
}
