package com.lijunpeng.algorithms.sort;

import java.util.Arrays;

public class MyQuickSort {
	public static void main(String[] args) {
		int[] arr = new int[] {7,1,2,5,6,3,4};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		quickSort(arr,0,arr.length-1);
	}
	
	public static void quickSort(int[] arr,int low, int high) {
//		// 基准值
//		System.out.println("high: " + high);
//		System.out.println("low: " + low);
//		if (low >= high) {
//			return;
//		}
//		int key = arr[low];
//		int index = low;
//		System.out.println();
//		System.out.println("--key--" + key);
//		int h = high;
//		int l = low;
//		while (low < high) {
//			// 从右边高位寻找第一个比基准值小的值
//			while (low < high && arr[high] > key) {
//				// 如果不比基准值大，高位往左移动一位
//				high--;
//			}
//			
//			// 寻找到第一个比基准值小的值
//			if (high > low) {
//				// 替换较小值和key的位置
//				int temp = arr[high];
//				arr[high] = key;
//				arr[low] = temp;
//				index = high;
//				// 低位往右移动一位
//				low++;
//			}
//			System.out.println(Arrays.toString(arr));
//			// 从左边低位寻找第一个比基准值大的值
//			while (low < high && arr[low] < key) {
//				// 如果比基准值小，低位往右移动一位
//				low++;
//			}
//			
//			// 寻找到第一个比基准值大的值
//			if (low < high) {
//				// 替换较大值和key的位置
//				int temp = arr[low];
//				arr[low] = key;
//				arr[high] = temp;
//				index = low;
//				// 高位往左移动一位
//				high--;
//			}
//			System.out.println(Arrays.toString(arr));
//		}
//		// 递归排序基准值左边区域
//		quickSort(arr, l, index -1);
//		// 递归排序基准值右边区域
//		quickSort(arr, index+1, h);
		
		 int i, j, index;
	        if (low > high) {
	            return;
	        }
	        i = low;
	        j = high;
	        index = arr[i]; // 用子表的第一个记录做基准
	        while (i < j) { // 从表的两端交替向中间扫描
	            while (i < j && arr[j] >= index)
	                j--;
	            if (i < j)
	                arr[i++] = arr[j];// 用比基准小的记录替换低位记录
	            while (i < j && arr[i] < index)
	                i++;
	            if (i < j) // 用比基准大的记录替换高位记录
	                arr[j--] = arr[i];
	        }
	        arr[i] = index;// 将基准数值替换回 a[i]
	        System.out.println(Arrays.toString(arr));
	        quickSort(arr, low, i - 1); // 对低子表进行递归排序
	        quickSort(arr, i + 1, high); // 对高子表进行递归排序

		
	}
}
