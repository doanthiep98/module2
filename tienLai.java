package introductionToJava;
import java.util.Scanner;
public class tienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Tien gui: ");
        money = input.nextDouble();
        System.out.println("So thang: ");
        month = input.nextInt();
        System.out.println("Phan tram lai: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tien lai: " + totalInterest);
    }
}







