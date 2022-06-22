package com.Collection.Set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomTest {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<Integer>();
        Random r = new Random();
        while(treeSet.size()<10){
            int num = r.nextInt(20)+1;
            treeSet.add(num);
        }
        for(Integer i: treeSet){
            System.out.println(i);
        }
    }
}
