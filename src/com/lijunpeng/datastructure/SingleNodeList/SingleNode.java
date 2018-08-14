package com.lijunpeng.datastructure.SingleNodeList;
/**
 * 单线链表节点
 * 2018年8月14日
 */
public class SingleNode<T> {
	
	/**
	 * 存储的值
	 */
	private T value;
	
	/**
	 * 下一节点
	 */
	private SingleNode<T> next;
	
	
	public SingleNode() {
	
	}
	
	public SingleNode(T value) {
		this.value = value;
	}
	
	
	public boolean hasNext() {
		return next != null;
	}
	
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public SingleNode<T> getNext() {
		return next;
	}

	public void setNext(SingleNode<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SingleNode)) {
			return false;
		}
		SingleNode<T> singleNode = (SingleNode<T>) obj;
		return obj == null ? false : singleNode.getValue().equals(this.value);
	}
	
	@Override
	public int hashCode() {
		return value.hashCode() + (int) System.currentTimeMillis()/1000 ;
	}
	
}
