package bai4;

import bai2.XPoly;
import bai3.StringUtil;

public class MainBai4 {
    public static void main(String[] args) {
        // tính diện tích hình tam giác
        double area = XPoly.triangleArea(5, 3);
        System.out.println("Diện tích tam giác: " + area);

        // tính chu vi hình tròn
        double circumference = XPoly.circleCircumference(4);
        System.out.println("Chu vi hình tròn: " + circumference);

        // tính tổng các số trong mảng
        double[] numbers = { 2.5, 3.7, 1.8, 4.2 };
        double sum = XPoly.sum(numbers);
        System.out.println("Tổng các số trong mảng: " + sum);

        // tìm số nhỏ nhất trong mảng
        double min = XPoly.min(numbers);
        System.out.println("Số nhỏ nhất trong mảng: " + min);

        // tìm số lớn nhất trong mảng
        double max = XPoly.max(numbers);
        System.out.println("Số lớn nhất trong mảng: " + max);

        // chuyển đổi các ký tự đầu tiên của mỗi từ sang chữ hoa
        String s = "nguyen van teo";
        String result = StringUtil.toUpperFirstChar(s);
        System.out.println("Chuyển đổi chữ hoa: " + result);
    }
}
