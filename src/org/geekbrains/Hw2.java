package org.geekbrains;

import java.util.ArrayList;

public class Hw2 {
    public int[] buildArray(int[] nums) {
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            ret[i] = nums[nums[i]];
        }
        return ret;
    }
}
