package com.IO.StudentTesrt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.sum()-s1.sum();
                int num2 = num==0 ? s1.getChinese()-s2.getChinese():num;
                int num3 = num2==0 ? s1.getChinese()-s2.getChinese():num2;
                int num4 = num3==0 ? s1.getChinese()-s2.getChinese():num3;
                return num4;
            }
        });
        for(int i=0; i<3;i++){
            Scanner sc =new Scanner(System.in);
            System.out.println("请第"+(i+1)+"个学生录入数据");
            System.out.println("姓名");
            String name = sc.nextLine();
            System.out.println("语文成绩");
            int chMark = sc.nextInt();
            System.out.println("数学成绩");
            int maMark = sc.nextInt();
            System.out.println("英语成绩");
            int enMark = sc.nextInt();

            Student s = new Student();
            s.setName(name);
            s.setChinese(chMark);
            s.setEnglish(enMark);
            s.setMath(maMark);
            treeSet.add(s);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bw1"));
        for(Student s0:treeSet){
            StringBuilder sb = new StringBuilder();
            sb.append(s0.getName()).append(","+s0.getChinese()).append(","+s0.getMath()).append(","+s0.getEnglish());
            bufferedWriter.write(sb.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
