package session3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalEmployee = 0; //tổng số nhân viên
        double totalSalary = 0; //tổng lương
        double maxSalary = 0; //lương cao nhất
        double minSalary = 500000000; //lương thấp nhất
        double bonus = 0; //tiền thưởng
        int select; //lựa chọn của người dùng

        //QUẢN LÝ LƯƠNG NHÂN VIÊN
        do {
            //hiển thị menu cho người dùng chọn
            System.out.print("""
                    ***************MENU NHẬP LƯƠNG***************                  
                    1.  	Nhập lương nhân viên                    
                    2.  	Hiển thị thống kê                  
                    3.  	Tính tổng số tiền thưởng cho nhân viên                  
                    4.  	Thoát
                    
                    Lựa chọn của bạn: 
                    """);
            select = sc.nextInt();

            //bắt đầu logic
            switch(select) {
                //nhập lương nhân viên
                case 1:
                    System.out.print("nhập lương nhân viên (nhập -1 để kết thúc): ");
                    do {
                        double salary = sc.nextDouble();
                        if(salary == -1) {
                            break;
                        } else if(salary < 0 || salary > 500000000) {
                            System.out.println("Lương không hợp lệ. Nhập lại.");
                            System.out.print("Nhập lương: ");
                        } else {
                            if(salary < 5000000) {
                                System.out.println("-> Phân loại: Thấp");
                                System.out.print("Nhập lương: ");
                                bonus += salary * 0.05;
                            } else if(salary < 15000000) {
                                System.out.println("-> Phân loại: Trung bình");
                                System.out.print("Nhập lương: ");
                                bonus += salary * 0.1;
                            } else if(salary < 50000000) {
                                System.out.println("-> Phân loại: Khá");
                                System.out.print("Nhập lương: ");
                                bonus += salary * 0.15;
                            } else if(salary < 100000000) {
                                System.out.println("-> Phân loại: Cao");
                                System.out.print("Nhập lương: ");
                                bonus += salary * 0.2;
                            } else {
                                System.out.println("-> Phân loại: Cao");
                                System.out.print("Nhập lương: ");
                                bonus += salary * 0.25;
                            }
                            totalEmployee += 1;
                            totalSalary += salary;
                            if(salary < minSalary) {
                                minSalary = salary;
                            }
                            if(salary > maxSalary) {
                                maxSalary = salary;
                            }
                        }
                    } while(true);
                    break;
                //hiển thị thống kê
                case 2:
                    if(totalEmployee == 0) {
                        System.out.println("Chưa có dữ liệu");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("----- Thống kê -----");
                        System.out.println("Số nhân viên: " + totalEmployee);
                        System.out.printf("Tổng lương: %,.0f VND\n", totalSalary);
                        System.out.printf("Lương trung bình: %,.0f VND\n", (totalSalary / (double)totalEmployee));
                        System.out.printf("Lương cao nhất: %,.0f VND\n", maxSalary);
                        System.out.printf("Lương thấp nhất: %,.0f VND\n", minSalary);
                        System.out.println();
                    }
                    break;
                //tính tổng số tiền thưởng cho nhân viên
                case 3:
                    System.out.println("--- Tính tổng số tiền thưởng cho nhân viên ---");
                    System.out.printf("Tổng tiền thưởng cho nhân viên: %,.0f VND\n", bonus);
                    System.out.println();
                    break;
                //thoát chương trình
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    sc.close();
                    return;
                //trường hợp nhập số khác
                default:
                    System.out.println("Hãy chọn từ 1-4");
                    System.out.println();
            }
        } while (true);
    }
}
