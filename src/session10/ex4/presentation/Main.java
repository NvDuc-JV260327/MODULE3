package session10.ex4.presentation;

import session10.ex4.business.AttendanceManager;
import session10.ex4.entity.Student;
import session10.ex4.utlils.InputData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();

        int choice;

        do {
            System.out.print("""
                                ***************** MENU QUẢN LÝ ĐIỂM DANH ******************
                                1. Thêm sinh viên
                                2. Sửa sinh viên
                                3. Xóa sinh viên
                                4. Hiển thị danh sách sinh viên
                                5. Thoát
                                """);
            System.out.print("Lựa chọn của bạn: ");
            choice = InputData.getInt(scanner, "");

            switch (choice) {
                // thêm sinh viên
                case 1:
                    int id = InputData.getInt(scanner, "Nhập id sinh viên: ");
                    String name = InputData.getSring(scanner, "Nhập tên sinh viên: ");
                    Student student = new Student(id, name);
                    manager.add(student);
                    System.out.println("Thêm sinh viên thành công!");
                    break;

                // sửa sinh viên
                case 2:
                    int updateId = InputData.getInt(scanner, "Nhập id sinh viên cần sửa: ");
                    int updateIndex = -1;
                    for(int i = 0; i < manager.students.size(); i++)
                        if(manager.students.get(i).getId() == updateId) {
                            updateIndex = i;
                            break;
                        }
                    if(updateIndex == -1) {
                        System.out.println("Sinh viên không tồn tại!");
                    } else {
                        String updateName = InputData.getSring(scanner, "Nhập tên mới sinh viên: ");
                        manager.update(updateIndex, new Student(updateId, updateName));
                        System.out.println("Sửa thông tin sinh viên thành công!");
                    }
                    break;

                // xóa sinh viên
                case 3:
                    int deleteId = InputData.getInt(scanner, "Nhập id sinh viên cần xóa: ");
                    int deleteIndex = -1;
                    for(int i = 0; i < manager.students.size(); i++) {
                        if(manager.students.get(i).getId() == deleteId) {
                            deleteIndex = i;
                            break;
                        }
                    }
                    if(deleteIndex == -1) {
                        System.out.println("Sinh viên không tồn tại!");
                    } else {
                        manager.delete(deleteIndex);
                        System.out.println("Xóa sinh viên thành công!");
                    }
                    break;

                // hiển thị danh sách sinh viên
                case 4:
                    System.out.println("*********** DANH SÁCH SINH VIÊN ***********");
                    manager.display();
                    break;

                // thoát
                case 5:
                    System.out.println("Kết thúc chương trình!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while(true);
    }
}
