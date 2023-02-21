package bai1;

import bai2.XPoly;

public class Main {

    public static void main(String[] args) {
        double result = sum(1.0,2.0,3.0);
        System.out.println(result);
        double[] nums = {1.0, 2.0, 3.0, 4.0, 5.0};
        double min = XPoly.min(nums);
        double max = XPoly.max(nums);
        System.out.println("Số nhỏ nhất: " + min);
        System.out.println("Số lớn nhất: " + max);
    }

    public static double sum(double... nums) {
        double total = 0.0;
        for (double num : nums) {
            total += num;
        }
        return total;
    }
}

