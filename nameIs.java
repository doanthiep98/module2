package introductionToJava;

import java.util.Scanner;

public class nameIs {
    public static void main(String[] args) {
        String name;
        Scanner nhap= new Scanner(System.in);
        System.out.println("What is your name?");
        name= nhap.nextLine();
        System.out.println("Hello "+name+" !");
    }
}
