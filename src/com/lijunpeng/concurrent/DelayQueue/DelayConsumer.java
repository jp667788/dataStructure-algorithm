package com.lijunpeng.concurrent.DelayQueue;

import java.util.concurrent.DelayQueue;

/**
 * 延时队列消费者
 * 
 * 2018年7月30日
 */
public class DelayConsumer implements Runnable{
	
	/**
	 * 延时队列
	 */
	private DelayQueue<DelayedMsg> queue;
	
	public DelayConsumer(DelayQueue<DelayedMsg> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		for (;;) {
			try {
				long millis = System.currentTimeMillis();
				DelayedMsg delayedMsg = queue.take();
				long millis2 = System.currentTimeMillis();
				System.out.println("消费消息：" + delayedMsg.getId() + ":" + delayedMsg.getBody());
				System.out.println("消费时间：" + (millis2 - millis));
				if (queue.size() == 0) {
					return;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
