package introductionToJava;

import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        int month;
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap thang ");
        month= nhap.nextInt();
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("thang "+month+ " co 31 ngay");
                break;
            case 2:
                System.out.println("thang "+month+ " co 28 or 29 ngay");
                break;
            case 4,6,9,11:
                System.out.println("thang "+month+ " co 30 ngay");
                break;
            default:
                System.out.println("sai thang, moi nhap lai!");
        }
    }
}
