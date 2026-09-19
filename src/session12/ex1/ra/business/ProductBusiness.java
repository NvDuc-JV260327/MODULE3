package session12.ex1.ra.business;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import session12.ex1.ra.entity.InputData;
import session12.ex1.ra.entity.Product;

public class ProductBusiness {
    private ArrayList<Product> products;
    Scanner scanner = new Scanner(System.in);

    public ProductBusiness() {
        products = new ArrayList<>();
    }

    public static int nextId = 1;

    // Thêm sản phẩm
    public void addProduct() {
        Product product = createProduct(nextId++);
        products.add(product);
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        if(products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống!");
        } else {
            System.out.println("*************** DANH SÁCH SẢN PHẨM *************");
            for(Product product : products) {
                System.out.println(product);
                System.out.println();
            }
        }
    }

    // Cập nhật sản phẩm theo mã sản phẩm
    public void updateProduct(int updateId) {
        int updateIndex = -1;
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getProductId() == updateId) {
                updateIndex = i;
                break;
            }
        }
        if(updateIndex == -1) {
            System.out.println("Sản phẩm không tồn tại!");
        } else {
            Product newProduct = createProduct(updateId);
            products.set(updateIndex, newProduct);
            System.out.println("Cập nhật thông tin sản phẩm thành công!");
            System.out.println();
        }
    }

    // Xóa sản phẩm theo mã sản phẩm
    public void deleteProduct(int id) {
        int deleteIndex = -1;
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getProductId() == id) {
                deleteIndex = i;
                break;
            }
        }
        if(deleteIndex == -1) {
            System.out.println("Sản phẩm không tồn tại!");
        } else {
            products.remove(deleteIndex);
            System.out.println("Xóa sản phẩm thành công!");
            System.out.println();
        }
    }

    // Tìm kiếm sản phẩm theo tên
    public void findProductName(String findName) {
        int total = 0;
        for(Product product : products) {
            if(product.getProductName().toLowerCase().contains(findName.toLowerCase())) {
                System.out.println(product);
                System.out.println();
                total++;
            }
        }
        if(total == 0) {
            System.out.println("Không có sản phẩm nào!");
        }
    }

    // Sắp xếp sản phẩm theo giá tăng dần
    public void sortPrice() {
        products.sort(Comparator.comparingDouble(Product :: getPrice));
    }

    // Sắp xếp sản phẩm theo số lượng giảm dần
    public void sortQuantity() {
        products.sort(Comparator.comparingInt(Product :: getQuantity).reversed());
    }

    // tạo 1 sp mới
    public Product createProduct(int id) {
        String productName = ""; // 10-50 ký tự không trùng lặp
        float price = 0; // số thực > 0
        String category = ""; // độ dài < 200 ký tự
        int quantity = -1; // >= 0
        while (productName.length() < 10 || productName.length() > 50) {
            productName = InputData.getString(scanner, "Nhập tên sản phẩm: ");
            if(productName.length() < 10 || productName.length() > 50) {
                System.out.println("Tên sản phẩm phải từ 10 - 50 ký tự!");
            }
        }

        while (price <= 0) {
            price = InputData.getFloat(scanner, "Nhập giá sản phẩm: ");
            if(price <= 0) {
                System.out.println("Giá sản phẩm phải > 0!");
            }
        }

        while (category.isEmpty() || category.length() > 200) {
            category = InputData.getString(scanner, "Nhập danh mục sản phẩm: ");
            if(category.isEmpty() || category.length() > 200) {
                System.out.println("Tên danh mục phải từ 1 - 200 ký tự!");
            }
        }

        while (quantity < 0) {
            quantity = InputData.getInt(scanner, "Nhập số lượng sản phẩm: ");
            if(quantity < 0) {
                System.out.println("Số lượng sản phẩm phải > 0");
            }
        }

        Product product = new Product(id, productName, price, category, quantity);

        return product;
    }
}
