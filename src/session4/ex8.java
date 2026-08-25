package session4;

import java.util.Arrays;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập số cạnh ma trận
        System.out.print("Nhập số cạnh ma trận: ");
        int n = sc.nextInt();

        // kiểm tra kích thước
        if(n == 0) {
            System.err.println("Ma trận không hợp lệ");
            sc.close();
            return;
        }

        // khởi tạo ma trận
        int[][] arr = new int[n][n];

        // nhập dữ liệu cho ma trận
        System.out.println("Nhập phân tử ma trận theo hàng:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // xoay 90 độ theo chiều kim đồng hồ
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
