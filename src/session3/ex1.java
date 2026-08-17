package session3;

import java.util.Scanner;

public class ex1 {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String customerName;
        String productName;
        float price;
        int quantity;
        boolean membershipCard;

        System.out.println("====== NHẬP THÔNG TIN HÓA ĐƠN ======");
        System.out.println("Nhập tên khách hàng:");
        customerName = input.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        productName = input.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        price = input.nextFloat();
        System.out.println("Nhập số lượng mua:");
        quantity = input.nextInt();
        System.out.println("Khách có thẻ thành viên? (true/false):");
        membershipCard = input.nextBoolean();

        float totalAmount = price * quantity; //tổng hóa đơn
        float vat = totalAmount * 0.08f; //tiền VAT
        float discount; //giảm giá
        if(membershipCard) {
            discount = totalAmount * 0.1f;
        } else {
            discount = 0;
        }
        float payment = totalAmount - discount + vat;

        System.out.println("========== HÓA ĐƠN ==========");
        System.out.printf("Khách hàng: %s\n", customerName);
        System.out.printf("Sản phẩm: %s\n", productName);
        System.out.printf("Số lượng: %d\n", quantity);
        System.out.printf("Đơn giá: %.2f\n", price);
        System.out.printf("Thành tiền: %.2f\n", totalAmount);
        System.out.printf("Giảm giá thành viên (10%%): %.2f\n", discount);
        System.out.printf("Tiền VAT (8%%): %.2f\n", vat);
        System.out.printf("Tổng thanh toán: %.2f", payment);
    }
}
