package bai2;

public class XPoly {
    public static double min(double... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Mảng truyền vào không có phần tử");
        }

        double min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static double max(double... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Mảng truyền vào không có phần tử");
        }

        double max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // phương thức tính chu vi hình tròn
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // phương thức tính tổng các số trong mảng
    public static double sum(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }



}
