package com.Interface.InterfaceTest;

public class PrintTest {
    public static void main(String[] args) {
        usePrintable((c)->{
            System.out.println(c);
        });
        usePrintable(new Printable() {
            @Override
            public void printString(String b) {
                System.out.println(b);
            }
        });
    }
    public static void usePrintable(Printable printable){
        printable.printString("niubi");
    }
}
