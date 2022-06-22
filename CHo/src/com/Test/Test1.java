package com.Test;
import java.util.Scanner;
public class Test1 {
        /**
         * 1+1/2-1/3+1/4-1/5……+1/n求和
         */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个正整数N值：");
            int n=sc.nextInt();
            double sum=0.0;
            String data=" ";
            for (int i = 1; i <=n; i++) {
                if(i==1){
                    sum=1;
                    data=data+"1";
                }
                else{
                    if(i%2==1){
                        data=data+("+1/")+i;
                        sum=sum+1.0/i;
                    }else{
                        data=data+("-1/")+i;
                        sum=sum-1.0/i;
                    }
                }
            }
            System.out.println(data+"="+String.format("%.5f",sum));
        }
    }
