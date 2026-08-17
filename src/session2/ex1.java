package session2;

import java.util.Scanner;

public class ex1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 số:");
        int a = scanner.nextInt();

        if(a == 0) {
            System.out.printf("Số không phải chẵn cũng không phải lẻ");
        } else if(a % 2 != 0) {
            System.out.printf("Số %d là số lẻ", a);
        } else {
            System.out.printf("Số %d là số chẵn", a);
        }
    }
}