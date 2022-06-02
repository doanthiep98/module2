package introductionToJava;

import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args) {
        int year;
        boolean check = false;
        Scanner nhap= new Scanner(System.in);
        System.out.println("enter the year");
        year=nhap.nextInt();
        if (year%4==0 && year%100!=0){
            check=true;
        }
        if (year%100==0 && year%400!=0){
            check=false;
        }
        if (year%100==0 && year%400==0){
            check=true;
        }
       if (check){
           System.out.println("nam "+year+ " la nam nhuan");
       }
       else
           System.out.println("nam "+year+ " khong la nam nhuan");
    }
}
