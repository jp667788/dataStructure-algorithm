package com.lijunpeng.concurrent.DelayQueue;

import java.util.concurrent.DelayQueue;

/**
 * 延迟队列实例
 * 
 * 2018年7月30日
 */
public class DelayQueueExample {
	
	public static void main(String[] args) {
		DelayQueue<DelayedMsg> queue = new DelayQueue<>();
		
		queue.add(new DelayedMsg(1, "A-Msg",3000));
		queue.add(new DelayedMsg(2, "B-Msg",3000));
		queue.add(new DelayedMsg(3, "C-Msg",9000));
		DelayConsumer consumer = new DelayConsumer(queue);
		
		new Thread(consumer).start();
		
	}
}
