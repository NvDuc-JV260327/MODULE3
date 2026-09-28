package session15.business.model;

public class ProductTotalByCatalog {
    private String catalog;
    private int quantity;

    public ProductTotalByCatalog() {
    }

    public ProductTotalByCatalog(String catalog, int quantity) {
        this.catalog = catalog;
        this.quantity = quantity;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("| Danh mục: %-15s | Số lượng: %-2d |", catalog, quantity);
    }
}
