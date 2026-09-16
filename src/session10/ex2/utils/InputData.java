package session10.ex2.utils;

import java.util.Scanner;

public class InputData {
    // lấy string
    public static String getString(Scanner scanner, String suggest) {
        String str = "";
        do {
            System.out.println(suggest);
            str = scanner.nextLine();
            if(str.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            }
        } while (str.isEmpty());

        return str;
    }

    // lấy int
    public static int getInt(Scanner scanner, String suggest) {
        int number;
        do {
            try {
                System.out.print(suggest);
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số");
                System.out.println();
            }
        } while (true);
    }
}
