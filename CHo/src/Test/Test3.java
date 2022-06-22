package Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        double sum = calculation(n);
        System.out.println("The final answer is: "+sum);
    }
    public static double calculation(int n){
        double sum = 0.0;
        double value = 0.0;
        for(double i = n;i>0;i--){
            if(i%2 == 0){
                value = -(2*i-1)/(2*i*2*i);
            }else{
                value = (2*i-1)/(2*i*2*i);
            }
            sum = sum + value;
        }
        return sum;
    }
}
