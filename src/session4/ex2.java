package session4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử cho mảng:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.print("Tổng các phân tử trong mảng là: " + sum);
        sc.close();
    }
}
