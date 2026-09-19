package session12.ex1.ra.entity;

public class Product {
    private int productId;
    private String productName;
    private float price;
    private String category;
    private int quantity;

    public Product() {};

    public Product(int productId, String productName, float price, String category, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override 
    public String toString() {
        return String.format("Id sản phẩm: %d\nTên sản phẩm: %s\nGiá sản phẩm: %,.2f\nDanh mục: %s\nSố lượng: %d", productId, productName, price, category, quantity);
    }
}
