package com.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class EnhanceForTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add(0,"a");
        list.add(1,"b");
        list.add(2,"c");
        list.add(3,"d");
        for(String s: list){
            System.out.println(s);
        }
    }
}
