package introductionToJava;

import java.util.Scanner;

public class mainRectangle {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Enter width:");
        double width= nhap.nextDouble();
        System.out.println("Enter height:");
        double height= nhap.nextDouble();
        rectangle rectangle= new rectangle(width,height);
        System.out.println("Your rectangle \n"+rectangle.display());
        System.out.println("Perimeter of rectangle:"+rectangle.getPerimeter());
        System.out.println("Area of the rectangle: "+rectangle.getArea());
    }
}
