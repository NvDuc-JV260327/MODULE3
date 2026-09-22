package session11.ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách số nguyên
        ArrayList<Integer> intNums = new ArrayList<>();
        Collections.addAll(intNums, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sử dụng Lambda Expression để in ra tất cả các số chẵn
        System.out.print("Các số chẵn trong danh sách: ");
        intNums.forEach(num -> {
            if(num % 2 == 0) {
                System.out.print(num + " ");
            }
        });

        // Sử dụng phuương thức tham chiêu để tính tổng của tất cả các số trong danh sách
        int sum = intNums.stream().mapToInt(Integer::intValue).sum();
        System.out.println();
        System.out.print("Tổng của tất cả các số trong danh sách: " + sum);
    }
}
