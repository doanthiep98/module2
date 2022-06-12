package Java;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray(scanner);
        System.out.println("Nhập giá trị muốn xóa: ");
        int element = scanner.nextInt();
        deleteElement(array, element);
        System.out.println("Các phần tử mảng : ");
        for (int e : array) {

            System.out.println(e);
        }
    }

    public static void deleteElement(int[] array, int element) {
        while (checkElement(element, array) != -1) {
            int index = checkElement(element, array);
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
        }
    }

    public static int[] createArray(Scanner scanner) {
        System.out.println("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
            for (int i = 0; i < length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int checkElement(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}