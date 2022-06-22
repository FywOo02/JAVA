package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //创建map对象
        Map<Integer,String> map = new HashMap<Integer,String>();
        //添加元素
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"a");

        Set<Integer> key = map.keySet();
        for(Integer i: key){
            String value = map.get(i);
            System.out.println(value);
            Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
            for(Map.Entry<Integer, String> m: entrySet){
                String v = m.getValue();
                Integer k = m.getKey();
            }
        }
    }
}
