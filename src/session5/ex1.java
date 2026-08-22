package session5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nhập vào chuỗi văn bản
        System.out.print("Nhập vào chuỗi văn bản: ");
        String str = scanner.nextLine();

        //nhập từ khóa cần tìm
        System.out.print("Nhập từ cần tìm: ");
        String findString = scanner.nextLine();

        //tìm kiếm
        int findIndex = str.indexOf(findString);

        //in ra vị trí
        if(findIndex == -1) {
            System.out.printf("Không tìm thấy từ \"%s\" trong chuỗi.", findString);
        } else {
            System.out.printf("Từ \"%s\" xuất hiện tại vị trí thứ %d trong chuỗi.", findString, findIndex);
        }

        scanner.close();
    }
}

