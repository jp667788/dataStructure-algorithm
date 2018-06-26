package com.lijunpeng.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEqualsList {
	
	public static void main(String[] args) {
		List<AClass> list1 = new ArrayList<>();
		List<AClass> list2 = new ArrayList<>();
		list1.add(new AClass("1"));
		list1.add(new AClass("3"));
		list1.add(new AClass("4"));
		list1.add(new AClass("1"));
		
		list2.add(new AClass("1"));
		list2.add(new AClass("3"));
		list2.add(new AClass("4"));
		list2.add(new AClass("1"));
		AClass[] arr1 = list1.toArray(new AClass[]{});
		AClass[] arr2 = list2.toArray(new AClass[]{});
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2));
	}
}
