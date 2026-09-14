package session10.ex1;

import java.util.Scanner;

public class InputData {

    // phương thức lấy 1 chuỗi
    public static String getString(Scanner scanner, String suggest) {
        String input = "";
        do {
            System.out.println(suggest);
            input = scanner.nextLine();
            if(input.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            }
        } while (input.isEmpty());
        return input;
    }

    // phương thức lấy int
    public static int getInt(Scanner scanner, String suggest) {
        String result = "";
        do {
            System.out.println(suggest);
            result = scanner.nextLine();
            try {
                if(result.isEmpty()) {
                    System.out.println("Vui lòng không để trống!");
                } else if(Integer.parseInt(result) < 0) {
                    System.out.println("Vui lòng nhập số nguyên >= 0!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên >= 0!");
            }
        } while (true);

        return Integer.parseInt(result);
    }

    // phương thức lấy double
    public static double getDouble(Scanner scanner, String suggest) {
        String result = "";
        System.out.println(suggest);
        result = scanner.nextLine();

        do {
            try {
                if(result.isEmpty()) {
                    System.out.println("Vui lòng không để trống!");
                } else if(Double.parseDouble(result) < 0) {
                    System.out.println("Vui lòng nhập số thực >= 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số thực >= 0");
            }
        } while(true);

        return Double.parseDouble(result);
    }
}
