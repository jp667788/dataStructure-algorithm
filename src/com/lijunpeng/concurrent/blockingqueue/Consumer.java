package com.lijunpeng.concurrent.blockingqueue;
/**
 * BlockingQueue消费者
 * 
 * 2018年7月30日
 */

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	protected BlockingQueue<String> queue;
	
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		// 消费队列中的元素
		try {
			System.out.println("TAKE: " + queue.take());
			System.out.println("TAKE: " + queue.take());
			System.out.println("TAKE: " + queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
