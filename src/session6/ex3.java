package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex3 {

    public static void hienThiDanhSach(ArrayList<String> danhSach) {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách biển số xe trống!");
            return;
        }

        System.out.println("Danh sách biển số xe:");
        for (String bienSo : danhSach) {
            System.out.println(bienSo);
        }
    }

    public static void timKiemBienSo(ArrayList<String> danhSach, String bienSoCanTim) {
        boolean found = false;

        for (String bienSo : danhSach) {
            if (bienSo.equals(bienSoCanTim)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Đã tìm thấy biển số xe.");
        } else {
            System.out.println("Không tìm thấy biển số xe.");
        }
    }

    public static void timTheoMaTinh(ArrayList<String> danhSach, String maTinh) {
        boolean found = false;

        System.out.println("Các biển số thuộc mã tỉnh " + maTinh + ":");

        for (String bienSo : danhSach) {
            if (bienSo.startsWith(maTinh)) {
                System.out.println(bienSo);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy biển số nào.");
        }
    }

    public static void sapXepTangDan(ArrayList<String> danhSach) {
        Collections.sort(danhSach);
        System.out.println("Đã sắp xếp thành công.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> danhSachBienSo = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n****************** QUẢN LÝ BIỂN SỐ XE ****************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = sc.nextInt();
            sc.nextLine(); // tránh lỗi nuốt dòng

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng biển số cần thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập biển số thứ " + (i + 1) + ": ");
                        String bienSo = sc.nextLine();

                        if (bienSo.matches("\\d{2}[A-Z]-\\d{3}\\.\\d{2}")) {
                            danhSachBienSo.add(bienSo);
                        } else {
                            System.out.println("Biển số không hợp lệ!");
                            i--;
                        }
                    }
                    break;

                case 2:
                    hienThiDanhSach(danhSachBienSo);
                    break;

                case 3:
                    System.out.print("Nhập biển số cần tìm: ");
                    String bienSoCanTim = sc.nextLine();
                    timKiemBienSo(danhSachBienSo, bienSoCanTim);
                    break;

                case 4:
                    System.out.print("Nhập mã tỉnh cần tìm: ");
                    String maTinh = sc.nextLine();
                    timTheoMaTinh(danhSachBienSo, maTinh);
                    break;

                case 5:
                    sapXepTangDan(danhSachBienSo);
                    hienThiDanhSach(danhSachBienSo);
                    break;

                case 6:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);

        sc.close();
    }
}
