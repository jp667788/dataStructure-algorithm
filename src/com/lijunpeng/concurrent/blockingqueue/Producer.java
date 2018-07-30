package com.lijunpeng.concurrent.blockingqueue;
/**
 * BolckingQueue生产者
 * 
 * 2018年7月30日
 */

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	protected BlockingQueue<String> queue;
	
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		// 往queue中放入元素
		try {
			queue.add("A");
			System.out.println("PUT : A");
			Thread.sleep(1000);
			queue.add("B");
			System.out.println("PUT : B");
			Thread.sleep(1000);
			queue.add("C");
			System.out.println("PUT : C");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
