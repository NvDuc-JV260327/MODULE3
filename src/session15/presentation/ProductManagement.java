package session15.presentation;

import session15.business.dao.IProductImpl;
import session15.business.model.Product;
import session15.business.model.ProductTotalByCatalog;
import session15.utils.InputData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    Scanner sc = new Scanner(System.in);
    private IProductImpl productImpl = new IProductImpl();


    public void menuDisplay() {
        do {
            System.out.print("""
                ********************PRODUCT MANAGEMENT****************
                
                1. Danh sách sản phẩm
                2. Thêm mới sản phẩm
                3. Cập nhật sản phẩm
                4. Xóa sản phẩm
                5. Tìm kiếm sản phẩm theo tên sản phẩm
                6. Sắp xếp sản phẩm theo giá tăng dần
                7. Thống kê số lượng sản phẩm theo danh mục
                8. Thoát
                """);
            int choice = InputData.getInt(sc, "Lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    List<Product> products = productImpl.getAllProduct();
                    products.forEach(System.out::println);
                    System.out.println();
                    break;

                case 2:
                    String name = InputData.getString(sc, "Nhập tên sản phẩm: ");
                    float price = 0f;
                    while (price <= 0f) {
                        price = InputData.getFloat(sc, "Nhập giá sản phẩm: ");
                        if(price <= 0f) {
                            System.out.print("Giá sản phẩm phải > 0!");
                        }
                    }
                    String title = InputData.getString(sc, "Nhập tiêu đề sản phẩm: ");
                    LocalDate created = InputData.getLocalDate(sc, "Nhập ngày tạo sản phẩm (dd/MM/yyyy)");
                    String catalog = InputData.getString(sc, "Nhập danh mục sản phẩm: ");
                    boolean status = InputData.getBoolean(sc, "Nhập trạng thái sản phẩm: ");
                    productImpl.addProduct(new Product(null, name, price, title, created, catalog, status));
                    System.out.println("Thêm sản phẩm thành công!");
                    System.out.println();
                    break;

                case 3:
                    int updateId = InputData.getInt(sc, "Nhập id sản phẩm muốn cập nhật: ");
                    boolean isExist = false;
                    for(Product product : productImpl.getAllProduct()) {
                        if(product.getId() == updateId) {
                            isExist = true;
                            break;
                        }
                    }
                    if(isExist) {
                        String newName = InputData.getString(sc, "Nhập tên sản phẩm: ");
                        float newPrice = 0f;
                        while (newPrice <= 0f) {
                            newPrice = InputData.getFloat(sc, "Nhập giá sản phẩm: ");
                            if(newPrice <= 0f) {
                                System.out.print("Giá sản phẩm phải > 0!");
                            }
                        }
                        String newTitle = InputData.getString(sc, "Nhập tiêu đề sản phẩm: ");
                        LocalDate newCreated = InputData.getLocalDate(sc, "Nhập ngày tạo sản phẩm (dd/MM/yyyy)");
                        String newCatalog = InputData.getString(sc, "Nhập danh mục sản phẩm: ");
                        boolean newStatus = InputData.getBoolean(sc, "Nhập trạng thái sản phẩm: ");
                        Product newProduct = new Product(updateId, newName, newPrice, newTitle, newCreated, newCatalog, newStatus);
                        productImpl.updateProduct(newProduct);
                        System.out.println("Cập nhật thông tin sản phẩm thành công!");
                        System.out.println();
                    } else {
                        System.out.println("Id không tồn tại!");
                        System.out.println();
                    }
                    break;

                case 4:
                    int deleteId = InputData.getInt(sc, "Nhập id sản phẩm muốn xóa: ");
                    boolean exist = false;
                    for (Product product : productImpl.getAllProduct()) {
                        if(product.getId() == deleteId) {
                            exist = true;
                            break;
                        }
                    }
                    if(exist) {
                        productImpl.deleteProduct(deleteId);
                        System.out.println("Xóa sản phẩm thành công!");
                        System.out.println();
                    } else {
                        System.out.println("Id không tồn tại!");
                        System.out.println();
                    }
                    break;

                case 5:
                    String findName = InputData.getString(sc, "Nhập tên sản phẩm muốn tìm: ");
                    List<Product> findProduct = productImpl.findProduct(findName);
                    if(findProduct.isEmpty()) {
                        System.out.println("Không có sản phẩm nào!");
                        System.out.println();
                    } else {
                        findProduct.forEach(System.out::println);
                        System.out.println();
                    }
                    break;

                case 6:
                    List<Product> sortedList = productImpl.sortProduct();
                    if(sortedList.isEmpty()) {
                        System.out.println("Danh sách sản phẩm trống!");
                        System.out.println();
                    } else {
                        sortedList.forEach(System.out::println);
                        System.out.println();
                    }
                    break;

                case 7:
                    List<ProductTotalByCatalog> productByCatalog = productImpl.quantityByCatalog();
                    if(productByCatalog.isEmpty()) {
                        System.out.println("Danh sách sản phẩm trống!");
                        System.out.println();
                    } else {
                        productByCatalog.forEach(System.out::println);
                        System.out.println();
                    }
                    break;

                case 8:
                    break;

                default:
            }
        } while (true);
    }
}
