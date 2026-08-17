package session2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào 1 số nguyên:");
        int n = input.nextInt();
        //tạo biến tạm để giữ lại số n
        int temp = n;
        //nếu n âm, đổi sang dương
        if(temp < 0) temp = -temp;
        //tạo biến đếm tổng các chữ số
        int sum = 0;
        //lặp tách các chữ số
        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.printf("N = %d, Tổng các chữ số là: %d", n, sum);
    }
}
