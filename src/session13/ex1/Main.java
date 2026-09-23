package session13.ex1;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = Database.getConnection();
        if(conn != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Kết nối thất bại!");
        }
    }
}
