package introductionToJava;

import java.util.Scanner;

public class chuyenNhietDo {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Nhap lua chon cua ban:");
            System.out.println("1.Chuyen do C sang F");
            System.out.println("2.Chuyen do F sang C");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            Scanner nhap = new Scanner(System.in);
            choice = nhap.nextInt();
            switch (choice){
                case 1: {
                            System.out.println("Nhap do C");
                            double DoC=nhap.nextDouble();
                            System.out.println("Do F chuyen tu C:"+CtoF(DoC));
                            break;
                        }
                case 2:{
                            System.out.println("Nhap do F");
                            double DoF=nhap.nextDouble();
                            System.out.println("Do C chuyen tu F:"+CtoF(DoF));
                            break;
                        }

                case 0: System.exit(0);
            }
        }
        while (choice != 0);
        }
    public static double CtoF (double celcius){
        double fareinheit=(9.0 / 5) * celcius + 32;
        return fareinheit;
    }
    public static double FtoC (double fareinheit){
        double celsius=(9.0 / 5) * fareinheit + 32;
        return celsius;
    }

}

