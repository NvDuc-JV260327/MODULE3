package session10.ex2.business;

import session10.ex2.entity.Book;
import java.util.HashMap;

public class BookManager {
    private HashMap<String, Book> books;

    // hàm khởi tạo
    public BookManager() {
        books = new HashMap<>();
    }

    // thêm sách
    public void addBook(String bookName, Book book) {
        books.put(bookName.toLowerCase(), book);
    }

    // tìm sách
    public Book findBook(String bookName) throws Exception {
        if(books.containsKey(bookName.toLowerCase())) {
            return books.get(bookName.toLowerCase());
        } else {
            throw new  Exception("Sách không tồn tại!");
        }
    }

    // in danh sách sách
    public void displayBooks() {
        if(books.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for(Book book : books.values()) {
                System.out.println(book);
            }
        }
    }
}
