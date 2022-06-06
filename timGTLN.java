package introductionToJava;

import java.util.Scanner;

public class timGTLN {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner nhap = new Scanner(System.in);
        do {
            System.out.println("Nhap kich thuoc mang:");
            size = nhap.nextInt();
            if (size > 20)
                System.out.println("Mang khong qua 20 phan tu");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu thu" + (i + 1) + ": ");
            array[i] = nhap.nextInt();
            i++;
        }
        System.out.println("Gia tri:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max=array[0];
        int index=1;
        for (int j = 0; j <array.length ; j++) {
            if(array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("Gia tri max la "+max+" o vi tri thu "+index);
    }
}
