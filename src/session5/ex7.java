package session5;

import java.util.Random;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tổng số ký tự trong mã: ");
        int n = sc.nextInt();

        if(n < 1 || n > 1000) {
            System.err.println("");
        }

        // tạo chuỗi lưu A-Z a-z 0-9
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // tạo Stringbuilder để chứa pass
        StringBuilder randomPass = new StringBuilder();

        // lặp n vòng để lấy n số random
        for(int i = 0; i < n; i++) {
            // sinh số random 0-62

            int randomIndex = random.nextInt(chars.length());
            // lấy ký tự ở index ngẫu nhiên được sinh ra cho vào chuỗi pass
            randomPass.append(chars.charAt(randomIndex));
        }

        // in pass
        System.out.println(randomPass);
    }
}
