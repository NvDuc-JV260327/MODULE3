package session1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều rộng:");
        float width = sc.nextFloat();
        System.out.println("nhập chiều dài:");
        float height = sc.nextFloat();
        float area = width * height; //diện tích
        float circumference = 2 * (width + height); //chu vi
        System.out.printf("Diện tích: %.2f\nChu vi: %.2f", area, circumference);
    }
}
