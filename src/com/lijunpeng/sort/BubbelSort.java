package com.lijunpeng.sort;
import java.util.Arrays;

/**
 * 冒泡排序
 * @author ljp
 *
 */
public class BubbelSort {
	public static void main(String[] args) {
		int[] arr = new int[]{5,3,7,1,8,2};
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				// 比较相邻两个元素的大小
				if (arr[j] > arr[j+1]) {
					// 如果前一个比后一个大，交换位置
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
