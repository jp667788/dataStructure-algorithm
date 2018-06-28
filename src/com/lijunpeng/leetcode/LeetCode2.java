package com.lijunpeng.leetcode;

/**
 * 
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，
 * 它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 
 * 题目地址：https://leetcode-cn.com/problems/add-two-numbers/description/
 * 										
 * @author ljp
 * 2018-06-29
 *
 */
public class LeetCode2 {
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        // 用一个新的引用用于递循环
		ListNode newNode = node;
		while (node != null){
        	int val1 = l1.val;
        	int val2 = l2.val;
        	// 超过十下一位的和需要加1
        	if (node.val + val1 + val2 >= 10) {
        		node.val = node.val + val1 + val2 - 10;
        		node.next = new ListNode(1);
        	} else {
        		node.val += val1 + val2;
        		node.next =  new ListNode(0);
        	}
        	// 如果两个连表都没有下一个 且 本层节点的和没有超过十则视为节点到此结束
        	// 如果节点的和超过十还需要一个节点表示超过的位数 也就是1
        	if (l1.next == null && l2.next == null && node.next.val + val1 +val2 < 10) {
        		node.next = null;
        	}
        	// 如果链表还未结束，需要进行递归，如果其中一个链表结束了，另一个还没结束，怎赋一个初始值
        	l1 = l1.next == null ? new ListNode(0) : l1.next;
        	l2 = l2.next == null ? new ListNode(0) : l2.next;
        	node = node.next;
        	
        }
        return newNode;
    }
	
	
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(9);
		ListNode node2 = new ListNode(9);
		ListNode node3 = new ListNode(9);
		node1.next = node2;
		node2.next = node3;
		ListNode node4 = new ListNode(9);
		ListNode node5 = new ListNode(9);
		ListNode node6 = new ListNode(9);
		node4.next = node5;
		node5.next = node6;
		
		ListNode listNode = addTwoNumbers(node1, node4);
		while (listNode != null) {
			System.out.print(listNode.val + "->");
			listNode = listNode.next;
		}
		
	}
	
}

