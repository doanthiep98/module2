package introductionToJava;

import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        int a;
        Scanner nhap= new Scanner(System.in);
        System.out.println("nhap so can check ");
        a= nhap.nextInt();
        if (a<2){
            System.out.println(a+" khong la so nguyen to");
        }
        else {
              boolean check=true;
              int i=2;
              while (i<=Math.sqrt(a)){
                  if (a%i==0){
                      check=false;
                      break;
                  }
                  i++;
              }
        if (check){
                    System.out.println(a+" la so nguyen to!");
                  }
        else
                System.out.println(a+" khong la so nguyen to!");
        }
    }
}
