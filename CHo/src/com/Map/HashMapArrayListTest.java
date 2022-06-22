package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapArrayListTest {
    public static void main(String[] args) {
        ArrayList<HashMap<Integer,Integer>> array = new ArrayList<HashMap<Integer,Integer>>();

        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
        hm1.put(001,01);
        hm1.put(002,01);
        hm1.put(003,01);
        array.add(hm1);

        HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();
        hm2.put(001,02);
        hm2.put(002,02);
        hm2.put(003,03);
        array.add(hm2);

        for(HashMap<Integer,Integer> r: array){
            Set<Integer> keySet = r.keySet();
            for(Integer k: keySet ){
                int num = r.get(k);
                System.out.println(k+","+num);
            }
        }
    }
}
