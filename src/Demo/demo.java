package Demo;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        String demo = "^[cdCD]\\d{3}$";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập : ");
            String s = scanner.nextLine();
            if(s.matches(demo)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }
}
