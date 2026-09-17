package session10.ex4.utlils;

import java.util.Scanner;

public class InputData {
    // lấy chuỗi
    public static String getSring(Scanner scanner, String suggest) {
        System.out.print(suggest);
        String str = "";

        while (str.isEmpty()) {
            str = scanner.nextLine();
            if(str.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            }
        }

        return str;
    }

    // lấy int
    public static int getInt(Scanner scanner, String suggest) {
        System.out.print(suggest);
        String str = "";

        while (true) {
            str = scanner.nextLine();
            try {
                if(str.isEmpty()) {
                    System.out.println("Vui lòng không để trống!");
                    continue;
                } else {
                    return Integer.parseInt(str);
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
    }
}
