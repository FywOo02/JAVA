package com.multiplicationtable;

public class Table {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 9) {
            j = 1;
            while (j <= i) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}