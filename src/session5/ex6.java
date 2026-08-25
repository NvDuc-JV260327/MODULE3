package session5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập mật khẩu
        String password = sc.nextLine();

        // tạo regex để kiểm tra
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[\\W]).{8,}";

        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        sc.close();
    }
}
