package session9.ex1.ra.presentation;

import session9.ex1.ra.entity.Student;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // mảng lưu thông tin sinh viên
        Student[] students = new Student[100];
        int currId = 0;

        do {
            System.out.println("""
                    *********************QUẢN LÝ SINH VIÊN********************                
                    1. Hiển thị danh sách sinh viên                   
                    2. Thêm sinh viên                   
                    3. Cập nhật thông tin sinh viên theo mã sinh viên                   
                    4. Xóa sinh viên theo mã sinh viên                   
                    5. Tìm sinh viên theo tên sinh viên                  
                    6. Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            int select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                // Hiển thị danh sách sinh viên
                case 1:
                    if(currId == 0) {
                        System.out.println("Danh sách sinh viên trống");
                        System.out.println();
                    } else {
                        System.out.println("========= Danh sách sinh viên =========");
                        for(int i = 1; i <= currId; i++) {
                            students[i].displayData();
                            System.out.println();
                        }
                    }
                    break;

                // Thêm sinh viên
                case 2:
                    int flag = 1;
                    while (flag != 0) {
                        students[++currId] = new Student();
                        students[currId].inputData(scanner, currId);
                        System.out.print("Nhập 0 để kết thúc, 1 để tiếp tục nhập: ");
                        flag = Integer.parseInt(scanner.nextLine());
                        System.out.println();
                    }
                    break;

                    // Cập nhật thông tin sinh viên theo mã sinh viên
                case 3:
                    System.out.print("Nhập Id sinh viên cần sửa thông tin: ");
                    int fixId = Integer.parseInt(scanner.nextLine());
                    if(students[fixId] == null) {
                        System.out.println("Mã sinh viên không tồn tại");
                        System.out.println();
                    } else {
                        students[fixId].displayData();
                        System.out.print("Nhập tên sinh viên: ");
                        students[fixId].setStudentName(scanner.nextLine());
                        System.out.print("Nhập tuổi: ");
                        students[fixId].setStudentAge(Integer.parseInt(scanner.nextLine()));
                        System.out.print("Nhập chuyên ngành: ");
                        students[fixId].setSpecialized(scanner.nextLine());
                        System.out.println("Sửa thông tin sinh viên thành công!");
                        System.out.println();
                        students[fixId].displayData();
                        System.out.println();
                    }
                    break;

                // Xóa sinh viên theo mã sinh viên
                case 4:
                    System.out.print("Nhập Id sinh viên cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    if(students[deleteId] == null) {
                        System.out.println("Mã sinh viên không tồn tại");
                        System.out.println();
                    } else {
                        for(int i = deleteId; i <= currId; i++) {
                            students[i] = students[i+1];
                            if(i == currId - 1) {
                                students[currId] = null;
                                break;
                            }
                        }
                        currId--;
                        System.out.println("Xóa sinh viên thành công!");
                        System.out.println();
                    }
                    break;

                // Tìm sinh viên theo tên sinh viên
                case 5:
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String findName = scanner.nextLine();
                    int totalStudent = 0;
                    for(int i = 1; i <= currId; i++) {
                        if(students[i].getStudentName().toLowerCase().contains(findName.toLowerCase())) {
                            students[i].displayData();
                            System.out.println();
                            totalStudent++;
                        }
                    }
                    if(totalStudent == 0) {
                        System.out.println("Không tìm thấy sinh viên nào tên " + findName);
                        System.out.println();
                    }
                    break;

                // Thoát
                case 6:
                    scanner.close();
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    System.out.println();
            }
        } while (true);
    }
}
