package com.lijunpeng.leetcode;

import java.util.Arrays;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 
 * 示例:
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * https://leetcode-cn.com/articles/two-sum/
 * 
 * 2018年8月8日
 */
public class LeetCode1 {
	public static void main(String[] args) {
		int [] nums = {0,1,2,0};
		System.out.println(Arrays.toString(twoSum(nums,3)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int [] arr = new int[2];
		if (nums == null || nums.length < 2) {
			return arr;
		}
		for (int i=0;i<nums.length;i++) {
			for (int j=0; j<nums.length;j++) {
				if (nums[j] == target - nums[i] && j != i) {
					if (j < i) {
						arr[0] = j;
						arr[1] = i;
					} else {
						arr[0] = i;
						arr[1] = j;
					}
				}
			}
		}
		
		return arr;
	}
}
