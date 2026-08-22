package session4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //khởi tạo biến
        int even = 0; //tổng số chẵn
        int odd = 0; //tổng số lẻ
        int row; //số hàng
        int column; //số cột

        //khởi tạo mảng 2 chiều
        System.out.print("Nhập số hàng: ");
        row = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        column = scanner.nextInt();
        int [][] arr = new int[row][column];

        //nhập mảng
        System.out.println("Nhập các phần tử cho mảng (theo từng hàng):");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        //tính số chẵn, lẻ trong mảng
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(arr[i][j] % 2 == 0) {
                    even += arr[i][j];
                } else {
                    odd += arr[i][j];
                }
            }
        }

        //in kết quả
        for(int i = 0; i < row; i++) {
            System.out.printf("Hàng %d: ", i+1);
            for(int j = 0; j < column; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.print("Tổng các số chẵn là: " + even);
        System.out.println();
        System.out.print("Tổng các số lẻ là: " +odd);

        scanner.close();
    }
}