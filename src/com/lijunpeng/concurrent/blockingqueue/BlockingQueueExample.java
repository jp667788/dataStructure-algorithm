package com.lijunpeng.concurrent.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 2018年7月30日
 */
public class BlockingQueueExample {
	
	public static void main(String[] args) {
		
		// 创建阻塞队列
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(128);
		
		// 创建生产者
		Producer producer = new Producer(queue);
		
		// 创建消费者
		Consumer consumer = new Consumer(queue);
		
		// 启动生产者、消费者
		
		new Thread(consumer).start();
		new Thread(producer).start();
	}
	
}
