package com.autobots._java.lambda.tasks;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        // int i = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        System.out.println();
    }
}
