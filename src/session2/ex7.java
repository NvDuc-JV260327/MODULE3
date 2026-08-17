package session2;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //kiểm tra tam giác hợp lệ
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài các cạnh của tam giác");
        System.out.println("nhập cạnh a:");
        float a = sc.nextFloat();
        System.out.println("nhập cạnh b:");
        float b = sc.nextFloat();
        System.out.println("nhập cạnh c:");
        float c = sc.nextFloat();

        //bắt đầu kiểm tra
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ba cạnh không tạo thành tam giác");
        } else {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân");
            } else if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)) {
                System.out.println("Đây là tam giác vuông");
            }
            else {
                System.out.println("Đây là tam giác thường");
            }
        }
    }
}