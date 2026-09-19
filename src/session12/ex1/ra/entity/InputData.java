package session12.ex1.ra.entity;

import java.util.Scanner;

public class InputData {
    // lấy chuỗi
    public static String getString(Scanner scanner, String suggest) {
        String str = "";
        
        while (str.isEmpty()) {
            System.out.print(suggest);
            str = scanner.nextLine();
            if(str.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            }
        }
        return str;
    }

    // lấy int 
    public static int getInt(Scanner scanner, String suggest) {
        String intNum = "";

        while(true) {
            System.out.print(suggest);
            try {
                intNum = scanner.nextLine();
                if(intNum.isEmpty()) {
                    System.out.println("Vui lòng không để trống!");
                    continue;
                } else {
                    return Integer.parseInt(intNum);
                }
            } catch(Exception e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }

    // lấy float
    public static float getFloat(Scanner scanner, String suggest) {
        String floatNum = "";

        while(true) {
            System.out.print(suggest);
            try {
                floatNum = scanner.nextLine();
                if(floatNum.isEmpty()) {
                    System.out.println("Vui lòng không để trống!");
                    continue;
                } else {
                    return Float.parseFloat(floatNum);
                }
            } catch(Exception e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
    }
}
