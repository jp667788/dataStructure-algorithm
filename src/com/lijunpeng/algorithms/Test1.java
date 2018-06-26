package com.lijunpeng.algorithms;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,1,2,3,5};
		int result = 0;
		for (int i : arr) {
			result = result ^ i;
		}
		System.out.println(result);
	}
}
