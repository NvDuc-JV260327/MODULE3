package session1;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);

        //nhập bán kính
        System.out.println("Nhập bán kính hình tròn:");
        double r = scanner.nextDouble();

        //tính diện tích
        double s = PI * r * r;

        //in ra màn hình
        System.out.printf("Diện tích: %.2f", s);
    }
}
