package session5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //khởi tạo stringBuilder, in chuỗi ban đầu
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.printf("Chuỗi ban đầu: %s\n", sb);

        //Xóa các ký tự từ vị trí 5 đến 9 trong chuỗi, in ra
        sb.delete(5, 10);
        System.out.printf("Chuỗi sau khi xóa: %s\n", sb);

        //Thay thế đoạn "World" bằng "Universe", in ra
        int replaceIndex = sb.indexOf("World");
        if(replaceIndex != -1) {
            sb.replace(replaceIndex, replaceIndex + 5, "Universe");
        }
        System.out.printf("Chuỗi sau khi thay thế: %s", sb);
    }
}
