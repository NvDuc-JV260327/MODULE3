package session10.ex2.entity;

public class Book {
    private String bookName;
    private String author;
    private int yearPublication;

    // contructor
    public Book() {
    }

    public Book(String bookName, String author, int yearPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    // getter & setter

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    // ghi đè pt khi in sách
    @Override
    public String toString() {
        return "Tên sách: " + bookName + ", Tác giả: " + author + ", Năm xuất bản: " + yearPublication;
    }
}
