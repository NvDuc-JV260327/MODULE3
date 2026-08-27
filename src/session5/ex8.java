package session5;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần nén (ký tự a-z A-Z):");
        String str = sc.nextLine();

        StringBuilder compressedString = new StringBuilder(); // chuỗi sau khi nén

        int n = str.length(); // độ dài chuỗi
        int j = 0;

        // kiểm tra chuỗi hợp lệ
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) < 'A' || str.charAt(i) > 'Z' && str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                System.err.println("Chuỗi không hợp lệ");
                System.exit(0);
            }
        }

        // lặp từ 0 -> n-1
        while (j < n) {
            int count = 0; // đếm số ký tự liên tiếp giống nhau
            char currChar = str.charAt(j); // ký tự đang kiểm tra

            // vòng lặp đếm ký tự nằm cạnh giống nhau
            while (j < n && str.charAt(j) == currChar) {
                count++;
                j++;
            }
            compressedString.append(currChar).append(count);
        }
        System.out.print(compressedString);
    }
}
