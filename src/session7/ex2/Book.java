package session7.ex2;

public class Book {
    private String title;
    private String author;
    private double price;

    // set tiêu đề
    public void setTitle(String title) {
        this.title = title;
    }

    // get tiêu đề
    public String getTitle() {
        return title;
    }

    // set tác giả
    public void setAuthor(String author) {
        this.author = author;
    }

    // get tác giả
    public String getAuthor() {
        return author;
    }

    // set giá
    public void setPrice(double price) {
        if(price < 0) {
            System.out.println("Giá không được âm");
        } else {
            this.price = price;
        }
    }

    // get giá
    public double getPrice() {
        return price;
    }
}
