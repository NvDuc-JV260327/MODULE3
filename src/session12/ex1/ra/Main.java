package session12.ex1.ra;

import java.util.Scanner;

import session12.ex1.ra.business.ProductBusiness;
import session12.ex1.ra.entity.InputData;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductBusiness productArr = new ProductBusiness();
        int choice; 

        do {
            System.out.print("""
                    *********************QUẢN LÝ SẢN PHẨM********************
                    1. Thêm sản phẩm
                    2. Danh sách sản phẩm
                    3. Cập nhật sản phẩm theo mã sản phẩm
                    4. Xóa sản phẩm theo mã sản phẩm
                    5. Tìm kiếm sản phẩm theo tên
                    6. Sắp xếp sản phẩm theo giá tăng dần
                    7. Sắp xếp sản phẩm theo số lượng giảm dần
                    8. Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            choice = InputData.getInt(scanner, "Lựa chọn của bạn: ");

            switch (choice) {
                // thêm sp
                case 1:
                    productArr.addProduct();
                    System.out.print("Thêm sản phẩm thành công!");
                    break;

                // hiển thị ds  
                case 2:
                    productArr.displayProducts();
                    break;

                // Cập nhật sản phẩm theo mã sản phẩm
                case 3:
                    int updateId = InputData.getInt(scanner, "Nhập id sản phẩm cần sửa: ");
                    productArr.updateProduct(updateId);
                    break;

                // Xóa sản phẩm theo mã sản phẩm  
                case 4:
                    int deleteId = InputData.getInt(scanner, "Nhập id sản phẩm cần xóa: ");
                    productArr.deleteProduct(deleteId);
                    break;

                // Tìm kiếm sản phẩm theo tên
                case 5:
                    String findName = InputData.getString(scanner, "Nhập tên sản phẩm cần tìm: ");
                    productArr.findProductName(findName);
                    break;

                // Sắp xếp sản phẩm theo giá tăng dần
                case 6:
                    productArr.sortPrice();
                    productArr.displayProducts();
                    break;

                // Sắp xếp sản phẩm theo số lượng giảm dần
                case 7:
                    productArr.sortQuantity();
                    productArr.displayProducts();
                    break;

                // Thoát
                case 8:
                    System.out.print("Kết thúc chương trình!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while(true);
    }
}
