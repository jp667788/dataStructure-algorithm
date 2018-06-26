package com.lijunpeng.sort;

import java.util.Arrays;

public class MyQuickSort {
	public static void main(String[] args) {
		int[] arr = new int[] {7,2,5,9,1,3};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
	}
	
	public static void quickSort(int[] arr,int low, int high) {
		// 基准值
		int key = arr[high];
		
		// 从低位开始查找第一个比基准值大的数
		int i = 0;
		while (i<high && i<=key) {
			i++;
		}
		// 替换位置
		if (i >= 0) {
			arr[high] = arr[i];
			arr[i] =key; 
		}
		// 从高位开始查找第一个比基准值小的数
		int j = high;
		while (j>low && j > key) {
			
		}
	}
}
