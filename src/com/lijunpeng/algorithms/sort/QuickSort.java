package com.lijunpeng.algorithms.sort;

import java.util.Arrays;

/**
 * 快速排序
 * @author ljp
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[] {5,2,7,1,9,6};
		qucikSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void qucikSort(int[] arr,int low, int high) {
		if (low > high) {
			return;
		}
		int i = low;
		int j = high;
		// 以key为中轴
		int key = arr[low];
		System.out.println("key：" + key);
		System.out.println(Arrays.toString(arr));
		// 完成一趟排序
		while (i < j) {
			// 从右到左找到第一个小于key的数
			while (i < j && arr[j] > key) {
				j--;
			}
			
			// 从左往右找到第一个大于key的值
			while (i < j && arr[i] <= key) {
				i++;
			}
			// 交换
			int p = arr[i];
			arr[i] = arr[j];
			arr[j] = p;
		}
		// 调整key的值
		int p = arr[i];
		arr[i] = arr[low];
		arr[low] = p;
		// 对key左边的数快排
		qucikSort(arr, low, i-1);
		// 对key右边的数快排
		qucikSort(arr, i+1, high);
	}
}
