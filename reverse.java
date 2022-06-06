package introductionToJava;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner nhap= new Scanner(System.in);
        do{
            System.out.println("Nhap kich thuoc mang:");
            size= nhap.nextInt();
            if (size>20)
                System.out.println("Mang khong qua 20 phan tu");
        }while (size>20);
        array= new int[size];
        int i=0;
        while (i< array.length){
            System.out.println("Nhap phan tu thu"+ (i+1)+": ");
            array[i]= nhap.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Phan tu trong mang: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Dao nguoc mang: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
