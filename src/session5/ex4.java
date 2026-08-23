package session5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex4 {
    public static boolean checkEmail(String email) {
        String emailRegex = "^[\\w._]+@[\\w.]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập email: ");
        String email = sc.nextLine();

        if(checkEmail(email)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        sc.close();
    }
}
