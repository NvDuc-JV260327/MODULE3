package session15;

import session15.presentation.ProductManagement;
import session15.utils.ConnectionDB;

import java.sql.Connection;

public class Application {
    public static void main(String[] args) {
        ProductManagement management = new ProductManagement();

        management.menuDisplay();
    }
}
