package session2;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số từ 100-999");
        int number = sc.nextInt();

        //kiểm tra đầu vào
        if(number < 100 || number > 999) {
            System.err.println("Số nhập vào không hợp lệ");
            return;
        }

        //tách số
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        //cách viết của từng chữ số
        //hàng trăm
        switch (hundreds) {
            case 1:
                System.out.print("Một trăm");
                break;
            case 2:
                System.out.print("Hai trăm");
                break;
            case 3:
                System.out.print("Ba trăm");
                break;
            case 4:
                System.out.print("Bốn trăm");
                break;
            case 5:
                System.out.print("Năm trăm");
                break;
            case 6:
                System.out.print("Sáu trăm");
                break;
            case 7:
                System.out.print("Bảy trăm");
                break;
            case 8:
                System.out.print("Tám trăm");
                break;
            case 9:
                System.out.print("Chín trăm");
                break;
            default:
                break;
        }

        //hàng chục
        switch (tens) {
            case 0:
                if(units != 0){
                    System.out.print(" lẻ");
                }
                break;
            case 1:
                System.out.print(" mười");
                break;
            case 2:
                System.out.print(" hai mươi");
                break;
            case 3:
                System.out.print(" ba mươi");
                break;
            case 4:
                System.out.print(" bốn mươi");
                break;
            case 5:
                System.out.print(" năm mươi");
                break;
            case 6:
                System.out.print(" sáu mươi");
                break;
            case 7:
                System.out.print(" bảy mươi");
                break;
            case 8:
                System.out.print(" tám mươi");
                break;
            case 9:
                System.out.print(" chín mươi");
                break;
            default:
                break;
        }

        //hàng đơn vị
        switch (units) {
            case 1:
                if(tens > 1) {
                    System.out.print(" mốt");
                } else {
                    System.out.print(" một");
                }
                break;
            case 2:
                System.out.print(" hai");
                break;
            case 3:
                System.out.print(" ba");
                break;
            case 4:
                System.out.print(" bốn");
                break;
            case 5:
                if(tens == 0) {
                    System.out.print(" năm");
                    break;
                } else {
                    System.out.print(" lăm");
                    break;
                }
            case 6:
                System.out.print(" sáu");
                break;
            case 7:
                System.out.print(" bảy");
                break;
            case 8:
                System.out.print(" tám");
                break;
            case 9:
                System.out.print(" chín");
                break;
            default:
                break;
        }
    }
}