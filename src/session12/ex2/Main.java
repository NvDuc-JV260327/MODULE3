package session12.ex2;

import session12.ex2.AppointmentBusiness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\n*********************QUẢN LÝ LỊCH HẸN********************");
            System.out.println("1. Thêm lịch hẹn");
            System.out.println("2. Hiển thị danh sách lịch hẹn");
            System.out.println("3. Tìm kiếm lịch hẹn theo tên bệnh nhân");
            System.out.println("4. Cập nhật lịch hẹn theo mã lịch hẹn");
            System.out.println("5. Xóa lịch hẹn theo mã lịch hẹn");
            System.out.println("6. Thống kê");
            System.out.println("7. Thoát");

            System.out.print("Lựa chọn của bạn: ");

            int choice;

            try {
                choice =
                        Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số");
                continue;
            }

            switch (choice) {

                case 1:
                    AppointmentBusiness.addAppointment();
                    break;

                case 2:
                    AppointmentBusiness.displayAppointments();
                    break;

                case 3:
                    AppointmentBusiness.searchByPatientName();
                    break;

                case 4:
                    AppointmentBusiness.updateAppointment();
                    break;

                case 5:
                    AppointmentBusiness.deleteAppointment();
                    break;

                case 6:
                    AppointmentBusiness.statistic();
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Chọn từ 1-7");
            }

        } while (true);
    }
}
