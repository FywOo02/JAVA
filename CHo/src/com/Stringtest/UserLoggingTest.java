package com.Stringtest;
import java.util.Scanner;

public class UserLoggingTest {
    public static void main(String[] args){
        String userName= "Cho";
        String userPassword= "1321870261";

        for(int i=1; i<=3; i++){
        //获取用户输入信息
        Scanner s = new Scanner(System.in);
        System.out.print("Username: ");
        String name= s.nextLine();
        System.out.print("Password: ");
        String pass= s.nextLine();
        //运用If语句判断input
        if(userName.equals(name) && userPassword.equals(pass)){
            System.out.println("Congratulation, you've logged in.");
            break;
        }else{
            if(i==3){
                System.out.println("WARNING: input error, please contact with administrator");
            }else{
                System.out.println("You also have "+(3-i)+" times to try");
            }
        }
    }
    }
}
