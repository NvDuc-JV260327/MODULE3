package session2;

import java.util.Scanner;

public class ex3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 số:");
        int number = scanner.nextInt();
        int sum = 0;
        if(number <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            for(int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.printf("Tổng các số từ 1 đến %d là %d", number, sum);
        }
    }
}
