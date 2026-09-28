package session15.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputData {
    public static int getInt(Scanner scanner, String suggestion) {
        do {
            System.out.print(suggestion);
            try {
                int num = Integer.parseInt(scanner.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        } while (true);
    }

    public static String getString(Scanner scanner, String suggestion) {
        do {
            System.out.print(suggestion);
            String str = scanner.nextLine();
            if(str.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
                continue;
            }
            return str;
        } while (true);
    }

    public static float getFloat(Scanner scanner, String suggestion) {
        do {
            System.out.print(suggestion);
            try {
                float num = Float.parseFloat(scanner.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số thực!");
            }
        } while (true);
    }

    public static LocalDate getLocalDate(Scanner scanner, String suggestion) {
        do {
            System.out.print(suggestion);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String strDate = scanner.nextLine();
            try {
                LocalDate date = LocalDate.parse(strDate, formatter);
                return date;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập đúng định dạng dd/MM/yyyy");
            }
        } while (true);
    }

    public static Boolean getBoolean(Scanner scanner, String suggestion) {
        do {
            System.out.print(suggestion);
            String str = scanner.nextLine().trim();
            if(str.equals("true") || str.equals("false")) {
                return Boolean.valueOf(str);
            }
            System.out.println("Vui lòng nhập true hoặc false!");
        } while (true);
    }
}
