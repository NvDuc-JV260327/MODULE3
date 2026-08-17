package session1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số của phân số 1:");
        int a = sc.nextInt();
        System.out.println("Nhập mẫu số của phân số 1:");
        int b = sc.nextInt();
        System.out.println("Nhập tử số của phân số thứ 2:");
        int c = sc.nextInt();
        System.out.println("Nhập mẫu số của phân số thứ 2:");
        int d = sc.nextInt();
        System.out.printf("Tổng của 2 phân số %d/%d + %d/%d Kết quả: %d/%d", a, b, c, d, (a*d + b*c), b*d);
    }
}
