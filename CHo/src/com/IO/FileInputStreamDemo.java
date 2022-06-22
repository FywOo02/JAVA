package com.IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        /*String a = "牛逼";
        byte[] by = a.getBytes();
        System.out.println(Arrays.toString(by));
        String s = new String(by);
        System.out.println(s);

         */
        //输出数据
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("OSW.txt"));
        char[] chars = {'A','B','C'};
        osw.write(chars);
        osw.close();
        //输入数据
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("OSW.txt"));
        char[] chars1 = new char[chars.length];
        inputStreamReader.read(chars1);
        System.out.println(chars1);

    }
}
