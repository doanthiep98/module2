package introductionToJava;

import java.util.Scanner;

public class ptrinhBacNhat {
    public static void main(String[] args) {
        float a,b,c,nghiem;
        Scanner inPut= new Scanner(System.in);
        System.out.println("nhap a ");
        a= inPut.nextFloat();
        System.out.println("nhap b ");
        b=inPut.nextFloat();
        System.out.println("nhap c ");
        c=inPut.nextFloat();
        if (a==0){
            if (b==c){
                System.out.println("vo nghiem");
            }
            else
                System.out.println("vo so nghiem");
        }
        if(a!=0){
            nghiem=(c-b)/a;
            System.out.println("nghiem la "+nghiem);
        }

    }
}
