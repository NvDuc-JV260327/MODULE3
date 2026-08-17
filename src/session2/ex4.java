package session2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tuổi của bạn");
        if(sc.hasNextInt()) {
            int age = sc.nextInt();
            if(age <= 0) {
                System.out.println("Vui lòng nhập vào một số nguyên  và lớn hơn 0");
            } else {
                System.out.println("Tuổi của bạn là " + age + "!");
            }
        } else {
            System.out.println("Vui lòng nhập vào một số nguyên  và lớn hơn 0");
        }
    }
}
