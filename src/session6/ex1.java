package session6;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[100]; // mảng lưu điểm
        int n = 0; // số lượng điểm

        do {
            System.out.print("""               
                ******************QUẢN LÝ ĐIỂM SV****************
                1. Nhập danh sách điểm sinh viên
                2. In danh sách điểm
                3. Tính điểm trung bình của các sinh viên
                4. Tìm điểm cao nhất và thấp nhất
                5. Đếm số lượng sinh viên đạt và trượt
                6. Sắp xếp điểm tăng dần
                7. Thống kê số lượng sinh viên giỏi và xuất sắc
                8. Thoát
                    """);
            int select = scanner.nextInt();

            switch (select) {
                //Nhập danh sách điểm sinh viên
                case 1:
                    System.out.println("Nhập điểm của sinh viên (nhập -1 để kết thúc): ");
                    double score;
                    do {
                        System.out.print("Nhập điểm: ");
                        score = scanner.nextDouble();
                        if(score == -1) {
                            break;
                        } else if(score < 0 || score > 10) {
                            System.err.println("Nhập điểm từ 0 - 10");
                        } else {
                            scores[n] = score;
                            n++;
                        }
                    } while (true);
                    System.out.println();
                    break;

                //In danh sách điểm
                case 2:
                    if(n == 0) {
                        System.out.println("Danh sách trống");
                        System.out.println();
                    } else {
                        System.out.print("Danh sách điểm sinh viên: ");
                        for(int i = 0; i < n; i++) {
                            System.out.print(scores[i] + " ");
                        }
                        System.out.println();
                        System.out.println();
                    }
                    break;

                //Tính điểm trung bình của các sinh viên
                case 3:
                    if(n == 0) {
                        System.out.println("Danh sách trống");
                        System.out.println();
                    } else {
                        int totalScore = 0; // tổng điểm
                        double avgScore = 0; // điểm trung bình
                        for(int i = 0; i < n; i++) {
                            totalScore += scores[i];
                        }
                        avgScore = totalScore / n;
                        System.out.printf("Điểm trung bình: %.2f\n", avgScore);
                        System.out.println();
                    }
                    break;
                //Tìm điểm cao nhất và thấp nhất
                case 4:
                    if(n == 0) {
                        System.out.println("Danh sách trống");
                        System.out.println();
                    } else {
                        double maxScore = scores[0]; // điểm cao nhất
                        double minScore = scores[0]; // điểm thấp nhất
                        for(int i = 0; i < n; i++) {
                            if(scores[i] > maxScore) {
                                maxScore = scores[i];
                            }
                            if(scores[i] < minScore) {
                                minScore = scores[i];
                            }
                        }
                        System.out.println("Điểm cao nhất: " + maxScore);
                        System.out.println("Điểm thấp nhất: " + minScore);
                        System.out.println();
                    }
                    break;

                //Đếm số lượng sinh viên đạt và trượt
                case 5:
                    if(n == 0) {
                        System.out.println("Danh sách trống");
                        System.out.println();
                    } else {
                        int meets = 0; // đạt
                        int failed = 0; // trượt
                        for(int i = 0; i < n; i++) {
                            if(scores[i] >= 5) {
                                meets ++;
                            } else {
                                failed ++;
                            }
                        }
                        System.out.println("Số lượng sinh viên đạt: " + meets);
                        System.out.println("Số lượng sinh viên trượt: " +failed);
                        System.out.println();
                    }
                    break;

                //Sắp xếp điểm tăng dần
                case 6:
                    if(n == 0) {
                        System.out.println("Danh sách trống");
                        System.out.println();
                    } else {
                        System.out.println("Điểm sắp xếp theo thứ tự tăng dần:");
                        for(int i = 0; i < n-1; i++) {
                            int minIndex = i;
                            for(int j = i+1; j < n; j++) {
                                if(scores[j] < scores[minIndex]) {
                                    minIndex = j;
                                }
                            }
                            double temp = scores[i];
                            scores[i] = scores[minIndex];
                            scores[minIndex] = temp;
                        }
                        for(int i = 0; i < n; i++) {
                            System.out.print(scores[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                //Thống kê số lượng sinh viên giỏi và xuất sắc
                case 7:
                    if(n == 0) {
                        System.out.println("Danh sách trống");
                        System.out.println();
                    } else {
                        int excellent = 0; // xuất sắc
                        for(int i = 0; i < n; i++) {
                            if(scores[i] >= 8) {
                                excellent ++;
                            }
                        }
                        System.out.println("Số sinh viên giỏi và xuất sắc: " + excellent);
                        System.out.println();
                    }
                    break;

                //Thoát
                case 8:
                    System.out.println("Kết thúc chương trình");
                    scanner.close();
                    return;

                default:
                    System.err.println("Lựa chọn không đúng");
                    break;
            }
        } while(true);
    }
}