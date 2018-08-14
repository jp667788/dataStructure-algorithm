package com.lijunpeng.leetcode;

import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * 
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * 
 * 你可以假设 nums1 和 nums2 均不为空
 * 
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/
 * 2018年8月13日
 */
public class LeetCode4 {
	
	public static void main(String[] args) {
		int [] nums1 = {2};
		int [] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int mid = (nums1.length + nums2.length)/2;
        
		int[] newArr = Arrays.copyOf(nums1, nums1.length + nums2.length);
		System.arraycopy(nums2, 0, newArr, nums1.length, nums2.length);
		Arrays.sort(newArr);
		// 长度为偶数，中位数为前后两数相加除2
		if (newArr.length % 2 == 0) {
			double sum = (newArr[mid-1] + newArr[mid]) / 2.0;
			if(sum % 1.0 == 0){
				return (newArr[mid-1] + newArr[mid]) / 2;
			} else {
				return sum / 2.0; 
			}
		} else {
			return newArr[mid];
		}
	}
}
