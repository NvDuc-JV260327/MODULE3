package session10.ex3.utils;

import java.util.Scanner;

public class InputData {
    // lấy chuỗi string
    public static String getString(Scanner scanner) {
        String str = "";
        do {
            str = scanner.nextLine();
            if(str.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            }
        } while (str.isEmpty());

        return str;
    }

    // lấy int
    public static int getInt(Scanner scanner) throws Exception {
        int num;
        do {
            try {
                num = Integer.parseInt(scanner.nextLine());
                return num;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số!");
            }
        } while (true);
    }
}
