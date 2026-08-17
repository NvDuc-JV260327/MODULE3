package session1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a:");
        int a = scanner.nextInt();

        System.out.println("Nhập số b:");
        int b = scanner.nextInt();

        System.out.printf("a = %d và b = %d\n", a, b);
        System.out.printf("Tổng 2 số a+b = %d\n", a+b);
        System.out.printf("Hiệu 2 số a-b = %d\n", a-b);
        System.out.printf("Tích 2 số a*b = %d\n", a*b);
        System.out.printf("Thương 2 số a/b = %.2f\n", (double)a/b);
        System.out.printf("Số dư khi chia số a cho b = %d", a%b);
    }
}
