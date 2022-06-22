package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        String convertMonth = "";
        String weather = "";
        switch(month){
            case 1 :
                convertMonth = "January";
                weather = "Spring";
                break;
            case 2 :
                convertMonth = "February";
                weather = "Spring";
                break;
            case 3 :
                convertMonth = "March";
                weather = "Spring";
                break;
            case 4 :
                convertMonth = "April";
                weather = "Summer";
                break;
            case 5 :
                convertMonth = "May";
                weather = "Summer";
                break;
            case 6 :
                convertMonth = "June";
                weather = "Summer";
                break;
            case 7 :
                convertMonth = "July";
                weather = "Autumn";
                break;
            case 8 :
                convertMonth = "August";
                weather = "Autumn";
                break;
            case 9 :
                convertMonth = "September";
                weather = "Autumn";
                break;
            case 10 :
                convertMonth = "October";
                weather = "Winter";
                break;
            case 11 :
                convertMonth = "November";
                weather = "Winter";
                break;
            case 12 :
                convertMonth = "December";
                weather = "Winter";
                break;
            default:
                convertMonth = "wrong month";
                weather = "Winter";
        }
        System.out.println(convertMonth+", "+day+", "+year+" and it was "+weather);
    }
}
