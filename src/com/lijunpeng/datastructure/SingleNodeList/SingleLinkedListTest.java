package com.lijunpeng.datastructure.SingleNodeList;

public class SingleLinkedListTest {
	
	public static void main(String[] args) {
		SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
		
		SingleNode<Integer> node1 = new SingleNode<Integer>(1);
		linkedList.put(node1);
		SingleNode<Integer> node2 = new SingleNode<Integer>(2);
		linkedList.put(node2);
		SingleNode<Integer> node3 = new SingleNode<Integer>(3);
		linkedList.put(node3);
//		SingleNode<Integer> node4 = new SingleNode<Integer>(4);
//		linkedList.put(node4);
//		SingleNode<Integer> node5 = new SingleNode<Integer>(5);
//		linkedList.put(node5);
		System.out.println(linkedList.getFirst());
		linkedList.setFirst(reverse(linkedList.getFirst()));
		System.out.println(linkedList.toString());
		
	}
	
	/**
	 * @param linkedList
	 */
	public static <T> SingleNode<T> reverse(SingleNode<T> firstNode) {
		
		if (firstNode == null) {
			return null;
		}
		// 前一节点
		SingleNode<T> preNode = firstNode;
		// 当前节点
		SingleNode<T> node = preNode.getNext();
		// 后一节点
		SingleNode<T> nextNode = null ;
		preNode.setNext(null);
		while(node != null) {
			// 存储后一节点
			nextNode = node.getNext();
			// 将当前节点的后一节点设为前一几点
			node.setNext(preNode);
			preNode = node;
			node = nextNode;
		}
		return preNode;
	}
}
