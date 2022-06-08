package introductionToJava;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //ham khoi tao
     Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //phuong thuc static doi gia tri bien
    static void change() {
        college = "CODEGYM";
    }

    //phuong thuc hien thi gia tri
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
