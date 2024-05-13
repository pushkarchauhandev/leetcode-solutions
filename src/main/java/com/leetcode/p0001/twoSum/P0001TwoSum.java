package com.leetcode.p0001.twoSum;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class P0001TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 9, 11, 13};
        int targetSum = 13;
        P0001TwoSum obj = new P0001TwoSum();
        Arrays.stream(obj.twoSumGetIndexes(nums, targetSum)).forEach(System.out::println);
        System.out.println("------------------------");
        Arrays.stream(obj.twoSumGetValues(nums, targetSum)).forEach(System.out::println);
    }

    private int[] twoSumGetIndexes(int[] nums, int targetSum) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = targetSum - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    private int[] twoSumGetValues(int[] nums, int targetSum) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = targetSum - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{complement, nums[i]};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}
