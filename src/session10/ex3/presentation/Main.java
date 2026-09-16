package session10.ex3.presentation;

import session10.ex3.business.UserManager;
import session10.ex3.entity.User;
import session10.ex3.utils.InputData;
import session10.ex3.utils.Regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserManager userManager = new UserManager();
        int choice = -1;

        do {
            System.out.print("""
                    ******************** MENU QUẢN LÝ NGƯỜI DÙNG **********************
                    1. Thêm người dùng
                    2. Xóa người dùng
                    3. Hiển thị danh sách người dùng
                    4. Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            try {
                choice = InputData.getInt(scanner);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            switch(choice) {
                case 1:
                    System.out.println("Nhập tên người dùng: ");
                    String userName = InputData.getString(scanner);

                    String email = "";
                    while(true) {
                        System.out.println("Nhập email: ");
                        email = InputData.getString(scanner);
                        if(Regex.regexEmail(email)) {
                            break;
                        } else {
                            System.out.println("Email không hợp lệ!");
                        }
                    }

                    String phoneNumber = "";
                    while(true) {
                        System.out.println("Nhập số điện thoại: ");
                        phoneNumber = scanner.nextLine();
                        if(Regex.regexPhoneNumber(phoneNumber)) {
                            break;
                        } else {
                            System.out.println("Số điện thoại không hợp lệ!");
                        }
                    }

                    User user = new User(userName, email, phoneNumber);
                    userManager.addUser(user);
                    System.out.println("Thêm người dùng thành công!");
                    break;

                case 2:
                    System.out.println("Nhập email người dùng cần xóa:");
                    String deleteUser = InputData.getString(scanner);
                    if(userManager.deleteUser(deleteUser)) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Người dùng không tồn tại!");
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("*********** DANH SÁCH NGƯỜI DÙNG *************");
                    userManager.displayUsers();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (true);

    }
}
