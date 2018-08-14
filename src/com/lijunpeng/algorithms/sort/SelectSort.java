package com.lijunpeng.algorithms.sort;

import java.util.Arrays;
/**
 * 选择排序
 * @author ljp
 *
 */
public class SelectSort {
	public static void main(String[] args) {
		int[] arr = new int[]{5,3,7,1,6,2,4};
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectSort(int[] arr) {
		for (int i=0;i<arr.length-1;i++) {
			// 寻找未排序块中的最小元素
			int min = i;
			for(int j=i;j<arr.length;j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// 最小值替换
			if (min > i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
}
