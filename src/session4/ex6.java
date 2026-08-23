package session4;

import java.util.Scanner;
import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập kích thước và khởi tạo mảng
        System.out.print("Nhập kích thước của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // nhập phần tử của mảng
        System.out.println("Nhập các phần tử cho mảng:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // sắp xếp mảng theo thứ tự giảm dần
        selectionSort(arr);

        // Nhập số cần tìm
        System.out.print("Nhập số cần tìm: ");
        int findNumber = scanner.nextInt();

        // in kết quả
        System.out.print("Mảng sau khi sắp xếp theo thứ tự giảm dần: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();

        if(linearSearch(arr, findNumber) != -1) {
            System.out.printf("Tìm kiếm tuyến tính: Phần tử %d được tìm thấy tại chỉ số %d\n", findNumber, linearSearch(arr, findNumber));
        }
        if(binarySearch(arr, findNumber) != -1) {
            System.out.printf("Tìm kiếm nhị phân: Phần tử %d được tìm thấy tại chỉ số %d", findNumber, binarySearch(arr, findNumber));
        }
    }

    // sắp xếp theo thứ tự giảm dần
    public static void selectionSort(int[] arr) {
        int n = arr.length; //độ dài mảng

        for(int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // tìm kiếm tuyến tính
    public static int linearSearch(int[] arr, int searchNumber) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }

    //tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int searchNumber) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == searchNumber) {
                return mid;
            } else if(searchNumber > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
