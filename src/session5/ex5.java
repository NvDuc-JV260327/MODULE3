package session5;

public class ex5 {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder sBuilder = new StringBuilder("Hello");
        StringBuffer sBuffer = new StringBuffer("Hello");
        long startTime, endTime;
        long sTime, sBuilderTime, sBufferTime;

        // đo thời gian nối chuỗi của string
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            s += " World";
        }
        endTime = System.currentTimeMillis();
        sTime = endTime - startTime;

        // đo thời gian nối chuỗi của stringBuilder
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            sBuilder.append(" World");
        }
        endTime = System.currentTimeMillis();
        sBuilderTime = endTime - startTime;

        // đo thời gian nối chuỗi của stringBuffer
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            sBuffer.append(" World");
        }
        endTime = System.currentTimeMillis();
        sBufferTime = endTime - startTime;

        // in kết quả
        System.out.printf("Thời gian thực hiện với String: %d ms\n", sTime);
        System.out.printf("Thời gian thực hiện với String Builder: %d ms\n", sBuilderTime);
        System.out.printf("Thời gian thực hiện với String Buffer: %d ms", sBufferTime);
    }
}
