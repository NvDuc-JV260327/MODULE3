package session5;

import  java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nhập vào chuỗi ký tự
        System.out.println("Nhập vào chuỗi ký tự:");
        String str = scanner.nextLine();

        //thay thế ký tự số bằng *
        String replaceStr = str.replaceAll("[0-9]", "*");

        //in ra chuỗi đã thay thế
        System.out.print("Chuỗi đã thay thế: " + replaceStr);

        //đóng scanner
        scanner.close();
    }
}
