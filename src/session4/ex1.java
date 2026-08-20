package session4;

import java.util.Scanner;
import java.util.Arrays;

public class ex1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Nhập kích thước mảng:");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Nhập các phần tử cho mảng:");
         for(int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         selectionSort(arr);
         System.out.print("Mảng sau khi đã sắp xếp theo thứ tự giảm dần: ");
         System.out.println(Arrays.toString(arr));
         System.out.print("Phần tử lớn nhất trong mảng là: " + arr[0]);
         sc.close();
    }

    //hàm selectionSort
    public static void selectionSort(int[] arr) {
         int n = arr.length;
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
}
