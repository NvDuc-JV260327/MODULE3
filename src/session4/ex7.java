package session4;

import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập kích thước
        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();

        // kiểm tra mảng rỗng
        if (n == 0) {
            System.err.println("Mảng không hợp lệ");
            sc.close();
            return;
        }

        // khởi tạo mảng
        int[] arr = new int[n];

        // tạo mảng phụ lưu những phần tử không bị trùng
        int[] newArr = new int[n];
        int k = 0; // chỉ số mảng phụ

        // nhập mảng
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // kiểm tra từng phần tử
        for (int i = 0; i < n; i++) {
            int frequency = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j) {
                    frequency++;
                    break;
                }
            }
            if (frequency == 1) {
                newArr[k++] = arr[i];
            }
        }
        if (k == 0) {
            System.out.println("Không có phần tử nào duy nhất trong mảng");
        } else {
            int[] lastArr = Arrays.copyOf(newArr, k);
            System.out.print(Arrays.toString(lastArr));
        }

        sc.close();
    }
}
