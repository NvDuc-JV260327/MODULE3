package session12.ex2;

import session12.ex2.Appointment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class AppointmentBusiness {

    private static final List<Appointment> appointments =
            new ArrayList<>();

    private static final Scanner scanner =
            new Scanner(System.in);

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Thêm
    public static void addAppointment() {

        Appointment ap = new Appointment();

        var ref = new Object() {
            String id;
        };

        do {
            System.out.print("Nhập mã lịch hẹn (6 ký tự): ");
            ref.id = scanner.nextLine();

            if (ref.id.length() != 6) {
                System.out.println("Mã phải gồm 6 ký tự");
                continue;
            }

            boolean exist = appointments.stream()
                    .anyMatch(a -> a.getAppointmentId().equals(ref.id));

            if (exist) {
                System.out.println("Mã đã tồn tại");
                continue;
            }

            break;

        } while (true);

        ap.setAppointmentId(ref.id);

        // tên bệnh nhân
        do {
            System.out.print("Nhập tên bệnh nhân: ");
            String name = scanner.nextLine();

            if (name.length() < 10 || name.length() > 50) {
                System.out.println("Tên từ 10-50 ký tự");
            } else {
                ap.setPatientName(name);
                break;
            }

        } while (true);

        // sdt
        String regex =
                "^(03|05|07|08|09)\\d{8}$";

        do {
            System.out.print("Nhập số điện thoại: ");
            String phone = scanner.nextLine();

            if (!phone.matches(regex)) {
                System.out.println("Số điện thoại không hợp lệ");
            } else {
                ap.setPhoneNumber(phone);
                break;
            }

        } while (true);

        // ngày hẹn
        do {
            try {
                System.out.print("Nhập ngày hẹn (dd/MM/yyyy): ");

                LocalDate date =
                        LocalDate.parse(scanner.nextLine(),
                                formatter);

                ap.setAppointmentDate(date);
                break;

            } catch (Exception e) {
                System.out.println("Sai định dạng");
            }

        } while (true);

        // bác sĩ
        do {
            System.out.print("Nhập bác sĩ phụ trách: ");
            String doctor = scanner.nextLine();

            if (doctor.length() > 200) {
                System.out.println("Tối đa 200 ký tự");
            } else {
                ap.setDoctor(doctor);
                break;
            }

        } while (true);

        appointments.add(ap);

        System.out.println("Thêm thành công");
    }

    // Hiển thị
    public static void displayAppointments() {

        appointments.stream()
                .sorted(Comparator.comparing(
                        Appointment::getAppointmentDate))
                .forEach(System.out::println);
    }

    // Tìm kiếm
    public static void searchByPatientName() {

        System.out.print("Nhập tên cần tìm: ");
        String keyword = scanner.nextLine();

        List<Appointment> result =
                appointments.stream()
                        .filter(a -> a.getPatientName()
                                .toLowerCase()
                                .contains(keyword.toLowerCase()))
                        .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Không tìm thấy");
        } else {
            result.forEach(System.out::println);
        }
    }

    // Cập nhật
    public static void updateAppointment() {

        System.out.print("Nhập mã cần cập nhật: ");
        String id = scanner.nextLine();

        Optional<Appointment> optional =
                appointments.stream()
                        .filter(a ->
                                a.getAppointmentId().equals(id))
                        .findFirst();

        optional.ifPresentOrElse(

                ap -> {

                    System.out.print("Tên mới: ");
                    ap.setPatientName(scanner.nextLine());

                    System.out.print("SĐT mới: ");
                    ap.setPhoneNumber(scanner.nextLine());

                    System.out.print("Ngày mới(dd/MM/yyyy): ");
                    ap.setAppointmentDate(
                            LocalDate.parse(
                                    scanner.nextLine(),
                                    formatter));

                    System.out.print("Bác sĩ mới: ");
                    ap.setDoctor(scanner.nextLine());

                    System.out.println("Cập nhật thành công");
                },

                () -> System.out.println("Không tìm thấy")
        );
    }

    // Xóa
    public static void deleteAppointment() {

        System.out.print("Nhập mã cần xóa: ");
        String id = scanner.nextLine();

        Optional<Appointment> optional =
                appointments.stream()
                        .filter(a ->
                                a.getAppointmentId().equals(id))
                        .findFirst();

        optional.ifPresentOrElse(

                ap -> {

                    System.out.print("Bạn chắc chắn? (Y/N): ");
                    String confirm =
                            scanner.nextLine();

                    if (confirm.equalsIgnoreCase("Y")) {
                        appointments.remove(ap);
                        System.out.println("Đã xóa");
                    }
                },

                () -> System.out.println("Không tìm thấy")
        );
    }

    // Thống kê
    public static void statistic() {

        System.out.println("Tổng số lịch hẹn: "
                + appointments.size());

        Map<String, Long> result =
                appointments.stream()
                        .collect(Collectors.groupingBy(
                                Appointment::getDoctor,
                                Collectors.counting()
                        ));

        result.forEach(
                (doctor, total) ->
                        System.out.println(
                                doctor + ": " + total)
        );
    }
}