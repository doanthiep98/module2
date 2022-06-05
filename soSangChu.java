package introductionToJava;

import java.util.Scanner;


public class soSangChu {
    public static void main(String[] args) {
        int soNguyen;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap so nguyen can doc");
        soNguyen= nhap.nextInt();
        if(soNguyen<0||soNguyen>999){
            System.out.println("nhap lai");
        }
        if(soNguyen<20 && soNguyen>0){
            switch (soNguyen) {
                case 1 -> System.out.println("so mot");
                case 2 -> System.out.println("so hai");
                case 3 -> System.out.println("so ba");
                case 4 -> System.out.println("so bon");
                case 5 -> System.out.println("so nam");
                case 6 -> System.out.println("so sau");
                case 7 -> System.out.println("so bay");
                case 8 -> System.out.println("so tam");
                case 9 -> System.out.println("so chin");
                case 10 -> System.out.println("so muoi");
                case 11 -> System.out.println("so muoi mot");
                case 12 -> System.out.println("so muoi hai");
                case 13 -> System.out.println("so muoi ba");
                case 14 -> System.out.println("so muoi bon");
                case 15 -> System.out.println("so muoi lam");
                case 16 -> System.out.println("so muoi sau");
                case 17 -> System.out.println("so muoi bay");
                case 18 -> System.out.println("so muoi tam");
                case 19 -> System.out.println("so muoi chin");
            }
        }
        int tram=0;
        int chuc=0;
        int donvi=0;
        String hangTram="none";
        String hangChuc="none";
        String hangDonVi="none";
        if(soNguyen>=12 && soNguyen<999){
            tram=soNguyen/100;
            chuc=soNguyen%10;
            donvi=soNguyen-(tram*100+chuc*10);
        }
        switch (tram){
            case 0: hangTram=" khong tram";break;
            case 1: hangTram=" mot tram";break;
            case 2: hangTram=" hai tram";break;
            case 3: hangTram=" ba tram";break;
            case 4: hangTram=" bon tram";break;
            case 5: hangTram=" nam tram";break;
            case 6: hangTram=" sau tram";break;
            case 7: hangTram=" bay tram";break;
            case 8: hangTram=" tam tram";break;
            case 9: hangTram=" chin tram";break;
        }
        switch (chuc){
            case 0: hangChuc=" linh";break;
            case 1: hangChuc=" muoi";break;
            case 2: hangChuc=" hai muoi";break;
            case 3: hangChuc=" ba muoi";break;
            case 4: hangChuc=" bon muoi";break;
            case 5: hangChuc=" nam muoi";break;
            case 6: hangChuc=" sau muoi";break;
            case 7: hangChuc=" bay muoi";break;
            case 8: hangChuc=" tam muoi";break;
            case 9: hangChuc=" chin muoi";break;
        }
        switch (donvi){
            case 0: hangDonVi=" khong";break;
            case 1: hangDonVi=" mot";break;
            case 2: hangDonVi=" hai";break;
            case 3: hangDonVi=" ba";break;
            case 4: hangDonVi=" bon";break;
            case 5: hangDonVi=" nam";break;
            case 6: hangDonVi=" sau";break;
            case 7: hangDonVi=" bay ";break;
            case 8: hangDonVi=" tam ";break;
            case 9: hangDonVi=" chin ";break;
        }
        if(soNguyen>=12 && soNguyen<999){
            System.out.println(hangTram+hangChuc+hangDonVi);
        }
    }
}


