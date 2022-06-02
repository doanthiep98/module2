package day01;

import java.util.Scanner;

public class hinhChuNhat {
    public static void main(String[] args) {
        float width,length,s;
        Scanner nhap= new Scanner(System.in);
        width= nhap.nextFloat();
        length= nhap.nextFloat();
        s=width*length;
        System.out.println("dien tich "+s);
    }
}

