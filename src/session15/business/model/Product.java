package session15.business.model;

import java.sql.Date;
import java.time.LocalDate;

public class Product {
    private Integer id;
    private String name;
    private float price;
    private String title;
    private LocalDate created;
    private String catalog;
    private boolean status;

    public Product() {
    }

    public Product(Integer id, String name, float price, String title, LocalDate created, String catalog, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.title = title;
        this.created = created;
        this.catalog = catalog;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("| Id: %-2d | Name: %-23s | Price : %,-12.1f | Title: %-55s | Created: %-6s | Catalog: %-13s | Status: %-5s |",
                id, name, price, title, created, catalog, status);
    }
}
