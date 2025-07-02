package com.autobots._java.lambda.tasks;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(double23()));
        double23();
    }

    public static int[] double23() {
        int[] nums1 = {2, 3, 2};
        int[] nums = {1, 2, 3, 4, 2};
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }
}
