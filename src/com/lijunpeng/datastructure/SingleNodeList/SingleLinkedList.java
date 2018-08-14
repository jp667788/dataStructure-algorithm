package com.lijunpeng.datastructure.SingleNodeList;
/**
 * 单项链表实现
 * 2018年8月14日
 */

public class SingleLinkedList<T> {
	
	/**
	 * 链表长度
	 */
	private int size;
	
	/**
	 * 首节点
	 */
	private SingleNode<T> first;
	
	/**
	 * 尾节点
	 */
	private SingleNode<T> last;
	
	
	/**
	 * 往链表中添加元素
	 * 
	 * @param node
	 */
	public void put(SingleNode<T> node) {
		if (node == null) {
			throw new NullPointerException();
		}
		
		if (first == null) {
			this.first = node;
		} else if (last == null){
			this.first.setNext(node);
		} else {
			this.last.setNext(node);
		}
		SingleNode<T> lastNode = node;
		while(lastNode.getNext() != null) {
			lastNode = node.getNext();
		}
		this.last = lastNode;
		this.size++;
	}
	
	/**
	 * 从列表中获取元素
	 * 
	 * @param value
	 * @return
	 */
	public SingleNode<T> get(T value) {
		if (value == null) {
			return null;
		}
		if (first == null) {
			return null;
		}
		
		SingleNode<T> next = first;
		while(next != null){
			if (value.equals(next.getValue())) {
				return next;
			}
			next = next.getNext();
		}
		
		return null;
	}
	
	/**
	 * 获取指定位置元素
	 * @param index
	 * 		指定下标索引
	 * @return
	 */
	public SingleNode<T> get(int index){
		if (index < 0) {
			return get(0);
		}
		if (this.size == 0) {
			return null;
		}
		SingleNode<T> next = this.first;
		int i = 0;
		while(next != null) {
			if (i == index) {
				return next;
			}
			i++;
			next = next.getNext();
		}
		return null;
	}
	
	public SingleNode<T> getFirst() {
		return first;
	}

	public void setFirst(SingleNode<T> first) {
		this.first = first;
	}

	public SingleNode<T> getLast() {
		return last;
	}

	public void setLast(SingleNode<T> last) {
		this.last = last;
	}

	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (first == null) {
			return "";
		}
		SingleNode<T> next = first;
		sb.append(next.getValue().toString());
		while(next.hasNext()) {
			next = next.getNext();
			sb.append(" ,").append(next.getValue().toString());
		}
		
		return sb.toString();
	}
	
}
