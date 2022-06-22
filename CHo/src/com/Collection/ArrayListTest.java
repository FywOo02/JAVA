package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();

        c.add(1);
        c.add(2);
        Iterator<Integer> it = c.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
    }
}
