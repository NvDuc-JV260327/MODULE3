package session7.ex2;

public class mainEx2 {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("Java Programming");
        myBook.setAuthor("John Doe");
        myBook.setPrice(29.99);

        // hiển thị sách
        System.out.println("Tiêu đề: " + myBook.getTitle());
        System.out.println("Tác giả: " + myBook.getAuthor());
        System.out.println("Giá: " + myBook.getPrice());

        // thay đổi giá thành công
        myBook.setPrice(35.50);
        System.out.println("Giá mới: " + myBook.getPrice());

        // thay đổi giá không hợp lệ
        myBook.setPrice(-5.00);
    }
}
