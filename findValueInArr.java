package introductionToJava;

import java.util.Scanner;

public class findValueInArr {
    public static void main(String[] args) {
        String [] students={"Thanh","Quynh","Manh","Nam","Thang","Hang"};
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh:");
        String tenNhap=nhap.nextLine();
        boolean coTonTai=false;
        for (int i = 0; i <students.length ; i++) {
            if (students[i].equals(tenNhap)){
                System.out.println("Ten hoc sinh la: "+tenNhap+" o vi tri so"+(i+1));
                coTonTai=true;
                break;
            }
        }
        if (!coTonTai){
            System.out.println("Khong thay hoc sinh "+tenNhap+ " trong danh sach!");
        }
    }
}
