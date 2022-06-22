package com.Lambda.EatTest;

public class Test {
    public static void main(String[] args) {
        //常规实现类
        Eatable a = new EatableImp();
        EatableTest(a);

        //匿名内部类
        EatableTest(new Eatable() {
            @Override
            public void eat(String s) {

            }
        });
        //lambda表达式
        EatableTest((String s)->{
            System.out.println("niubi"+s);
        });
    }

   public static void EatableTest(Eatable a){
        String s = "nb";
        a.eat(s);
   }
}
