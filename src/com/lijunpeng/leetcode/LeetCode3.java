package com.lijunpeng.leetcode;
/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * 
 * 示例：
 * 
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 * 2018年7月30日
 */
public class LeetCode3 {

	public static void main(String[] args) {
		
		String s = "dvsdfgfsdad";
		lengthOfLongestSubstring(s); // 5 vsdfg
	}
	public static void lengthOfLongestSubstring(String s) {
        int max = 1;
        char[] chars = s.toCharArray();
        String subStr = chars[0]+"";
        int len = 1;
        for (int i=0;i<s.length()-1;i++) {
        	int index = subStr.indexOf(chars[i+1]);
            if (chars[i] != chars[i+1] && index < 0) {
                len += 1;
                subStr += chars[i+1];
            } else {
                subStr = subStr.substring(index + 1)+ chars[i+1];
                len = subStr.length();
            }
            if (max < len) {
                max = len;
            }
        }
        System.out.println(max);
    }
}
