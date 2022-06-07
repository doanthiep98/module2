package introductionToJava;

import java.util.Scanner;

public class mainQuadEqua {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap a:");
        double a= nhap.nextDouble();
        System.out.println("Nhap b:");
        double b= nhap.nextDouble();
        System.out.println("Nhap c:");
        double c= nhap.nextDouble();
        quadraticEquation Quad= new quadraticEquation(a,b,c);
        Quad.getDiscriminant(a,b,c);
        Quad.getRoot1(a,b,c);
        Quad.getRoot2(a,b,c);
        if(Quad.getDiscriminant(a,b,c)>=0){
            System.out.println("Phuong trinh co nghiem x1: "+Quad.getRoot1(a,b,c)+" x2: "+Quad.getRoot2(a,b,c));
        }
    }
}
