package session6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        String email = "";
        String phoneNumber = "";
        String passWord = "";

        do {
            System.out.print("""
                    ******************QUẢN LÝ NGƯỜI DÙNG****************
                    1, Nhập thông tin người dùng
                    2, Chuẩn hóa họ tên
                    3, Kiểm tra email hợp lệ
                    4, Kiểm tra số điện thoại hợp lệ
                    5, Kiểm tra mật khẩu hợp lệ
                    6, Thoát
                    """);
            System.out.printf("Lựa chọn của bạn: ");
            int select = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (select) {
                // Nhập thông tin người dùng
                case 1:
                    System.out.print("Nhập tên: ");
                    name = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    email = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    phoneNumber = scanner.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    passWord = scanner.nextLine();
                    System.out.println();
                    break;

                // Chuẩn hóa họ tên
                case 2:
                    if(name != "") {
                        System.out.printf("Tên trước khi chuẩn hóa: %s\n", name);
                        String standardizeName = standardize(name);
                        System.out.printf("Tên đã chuẩn hóa: %s\n\n", standardizeName);
                    } else {
                        System.err.println("Chưa có thông tin");
                        System.out.println();
                    }
                    break;

                // Kiểm tra email hợp lệ
                case 3:
                    if(checkEmail(email)) {
                        System.out.println("Email hợp lệ");
                        System.out.println();
                    } else {
                        System.out.println("Email không hợp lệ");
                        System.out.println();
                    }
                    break;

                // Kiểm tra số điện thoại hợp lệ
                case 4:
                    if(checkPhone(phoneNumber)) {
                        System.out.println("Số điện thoại hợp lệ");
                        System.out.println();
                    } else {
                        System.out.println("Số điện thoại không hợp lệ");
                        System.out.println();
                    }
                    break;

                // Kiểm tra mật khẩu hợp lệ
                case 5:
                    if(checkPassWord(passWord)) {
                        System.out.println("Mật khẩu hợp lệ");
                        System.out.println();
                    } else {
                        System.out.println("Mật khẩu không hợp lệ");
                        System.out.println();
                    }
                    break;

                // Thoát
                case 6:
                    System.out.println("Kết thúc chương trình");
                    scanner.close();
                    System.exit(0);

                    // trường hợp khác
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    System.out.println();
            }

        } while(true);
    }

    // chuẩn hóa họ tên
    public static String standardize(String fullName) {
        String standardizeString = "";

        // xóa khoảng cách đầu cuối
        String trimName = fullName.trim();

        // tách các chữ trong chuỗi ra bằng split()
        String[] nameArr = trimName.split(" ");

        // in hoa ký tự đầu của các từ, sử dụng subString
        for(int i = 0; i < nameArr.length; i++) {
            String upper = nameArr[i].substring(0, 1).toUpperCase();
            String lower = nameArr[i].substring(1).toLowerCase();
            standardizeString = standardizeString + upper + lower + " ";
        }
        return standardizeString;
    }

    // kiểm tra email hợp lệ
    public static boolean checkEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z.]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    // kiểm tra sđt hợp lệ
    public static boolean checkPhone(String phoneNumber) {
        String phoneRegex = "^0[35789]\\d{8}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    // kiểm tra mật khẩu hợp lệ
    public static boolean checkPassWord(String password) {
        String passRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\\W_]).{8}";
        Pattern pattern = Pattern.compile(passRegex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
