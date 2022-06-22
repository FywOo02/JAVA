package com.IO;

import java.io.*;
import java.util.ArrayList;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bw.txt"));
        String[] strings ={"中国","美国","加拿大"};
        for(String s:strings){
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("bw.txt"));
        ArrayList<String> arrayList = new ArrayList<String>();
        String line;
        while((line = bufferedReader.readLine())!=null){
            arrayList.add(line);
        }
        System.out.println(arrayList.toString());
        bufferedReader.close();
    }
}
