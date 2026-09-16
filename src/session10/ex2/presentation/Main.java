package session10.ex2.presentation;

import session10.ex2.business.BookManager;
import session10.ex2.entity.Book;
import session10.ex2.utils.InputData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        BookManager manager = new BookManager();
        int choice;

        do {
            System.out.print("""
                    ******************* MENU QUẢN LÝ SÁCH ********************
                    1. Thêm sách
                    2. Tìm kiếm sách
                    3. Hiển thị danh sách sách
                    4. Thoát                    
                    """);
            choice = InputData.getInt(scanner, "Lựa chọn của bạn: ");

            switch (choice) {
                // thêm sách
                case 1:
                    String bookName = InputData.getString(scanner, "Nhập tên sách: ");
                    String author = InputData.getString(scanner, "Nhập tên tác giả: ");
                    int yearPublication = InputData.getInt(scanner, "Nhập năm xuất bản: ");
                    Book book = new Book(bookName, author, yearPublication);
                    manager.addBook(bookName, book);

                    break;

                // tìm kiếm sách
                case 2:
                    String searchBook = InputData.getString(scanner, "Nhập tên sách cần tìm: ");
                    try {
                        Book foundBook = manager.findBook(searchBook);
                        System.out.println(foundBook);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                // hiển thị danh sách
                case 3:
                    System.out.println("********* DANH SÁCH SÁCH *********");
                    manager.displayBooks();

                    break;

                // thoát
                case 4:
                    System.out.println("Kết thúc chương trình!");
                    scanner.close();
                    System.exit(0);


                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    System.out.println();
            }

        } while (true);
    }
}
