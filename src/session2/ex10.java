package session2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên N: ");
        int number = sc.nextInt();
        boolean isFirst = true;
        for(int i = 1; i <= number; i++) {
            if(isHappyNumber(i)) {
                if(isFirst) {
                    System.out.print(i);
                    isFirst = false;
                } else {
                    System.out.print(", " + i);
                }
            }
        }
        sc.close();
    }

    public static boolean isHappyNumber(int number) {
        int sum;
        while (true) {
            //tách số, tính tổng bình phương
            sum = 0;
            while (number != 0) {
                sum += (number % 10) * (number % 10);
                number /= 10;
            }
            if(sum == 1) {
                return true;
            } else if (sum == 4) {
                return false;
            } else {
                number = sum;
            }
        }
    }
}