package session4;

import java.util.Scanner;
import java.util.Arrays;

public class ex4 {
    public static void swap(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        if(arr.length == 0) {
            System.err.println("Kích thước rỗng");
            return;
        }
        System.out.println("Nhập các phần tử của mảng:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        swap(arr);
        System.out.print("Mảng sau khi đảo ngược: ");
        System.out.print(Arrays.toString(arr));
        scanner.close();
    }
}
