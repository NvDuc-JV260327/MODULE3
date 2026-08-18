package session2;

import java.util.Scanner;

public class ex9 {
    //hàm xác định số Armstrong
    public static boolean armstrong(int number) {
        int copyNumber = number;
        int copyNumber2 = number;
        int count = 0; //lưu số chữ số
        int sum = 0; //lưu tổng

        //đếm số chữ số
        while(copyNumber != 0) {
            count += 1;
            copyNumber /= 10;
        }

        while(copyNumber2 != 0) {
            sum += (int)Math.pow(copyNumber2 % 10, count);
            copyNumber2 /= 10;
        }

        if(sum == number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nhập vào số nguyên N:");
        if(!input.hasNextInt()) {
            System.err.println("Số nhập vào không hợp lệ");
            return;
        }
        int n = input.nextInt();

        System.out.print(0);

        for(int i = 1; i <= n; i++) {
            if(armstrong(i)) {
                System.out.print(", " + i);
            }
        }
    }
}