package session3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select, totalStudent = 0;
        double totalScore = 0, avgScore = 0, minScore = 10, maxScore = 0;

        do {
            System.out.print("""
                ***************MENU NHẬP ĐIỂM***************
                1.      Nhập điểm học viên
                2.      Hiển thị thống kê
                3.      Thoát
                Lựa chọn của bạn: 
                """);
            select = sc.nextInt();
            switch (select) {
                case 1:
                    double inScore;
                    do {
                        System.out.println("Nhập điểm:");
                        inScore = sc.nextDouble();
                        if(inScore == -1) {
                            break;
                        } if(inScore < 0 || inScore > 10) {
                            System.err.println("Điểm không hợp lệ. nhập lại.");
                        } else {
                            if(inScore < 5) {
                                System.out.println("Học lực: Yếu");
                            } else if(inScore < 7) {
                                System.out.println("Học lực: Trung bình");
                            } else if(inScore < 8) {
                                System.out.println("Học lực: Khá");
                            } else if (inScore < 9) {
                                System.out.println("Học lực: Giỏi");
                            } else {
                                System.out.println("Học lực: Xuất sắc");
                            }
                            totalStudent += 1;
                            totalScore += inScore;
                            avgScore = totalScore / totalStudent;
                            if(inScore < minScore) {
                                minScore = inScore;
                            }
                            if (inScore > maxScore) {
                                maxScore = inScore;
                            }
                        }
                    } while (true);
                    break;
                case 2:
                    if(totalStudent == 0) {
                        System.out.println("Chưa có dữ liệu");
                        break;
                    } else {
                        System.out.println("------ Kết quả ------");
                        System.out.println("Số sinh viên đã nhập: " + totalStudent);
                        System.out.println("Điểm trung bình: " + avgScore);
                        System.out.println("Điểm cao nhất: " + maxScore);
                        System.out.println("Điểm thấp nhất: " + minScore);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không đúng");
            }
        } while(true);
    }
}
