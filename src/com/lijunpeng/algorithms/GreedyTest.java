package com.lijunpeng.algorithms;

import java.util.Arrays;

public class GreedyTest {
	
	public static void main(String[] args) {
		int[] g = {1,2,1,2};
		int[] s = {1,2,3,1};
		Arrays.sort(g);
	    Arrays.sort(s);
	    int gi = 0, si = 0;
	    while (gi < g.length && si < s.length) {
	        if (g[gi] <= s[si]) {
	            gi++;
	        }
	        si++;
	    }
	    System.out.println(gi);
	}
	
}
