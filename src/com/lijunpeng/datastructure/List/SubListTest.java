package com.lijunpeng.datastructure.List;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018年7月2日
 */
public class SubListTest {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		List<String> subList = list.subList(0, 2);
		List<String> newList = new ArrayList<String>();
		newList.addAll(subList);
		newList.set(0, "new1");
		System.out.println("list:" + list); // list:[1, 2, 3, 4]
		System.out.println("subList:" + subList); // subList:[1, 2]
		System.out.println("newList:" + newList); // newList:[new1, 2]
		
	}
}
