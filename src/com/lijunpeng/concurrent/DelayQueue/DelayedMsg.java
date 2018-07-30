package com.lijunpeng.concurrent.DelayQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * 2018年7月30日
 */
public class DelayedMsg implements Delayed {
	
	/**
	 * 消息编号
	 */
	private int id;
	
	/**
	 * 消息内容
	 */
	private String body;
	
	/**
	 * 执行时间
	 */
	private long excuteTime;
	
	
	public DelayedMsg() {
		
	}
	
	public DelayedMsg(int id, String body) {
		this.id = id;
		this.body = body;
	}
	
	public DelayedMsg(int id, String body, long excuteTime) {
		this.id = id;
		this.body = body;
		// 单位转化
		this.excuteTime = TimeUnit.NANOSECONDS.convert(excuteTime, TimeUnit.MILLISECONDS) + System.nanoTime();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public long getExcuteTime() {
		return excuteTime;
	}

	public void setExcuteTime(long excuteTime) {
		this.excuteTime = excuteTime;
	}

	@Override
	public int compareTo(Delayed delayed) {
		DelayedMsg msg = (DelayedMsg) delayed;
		return this.id > msg.id ? 1 : (this.id < msg.id ? -1 : 0) ;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return  unit.convert(this.excuteTime - System.nanoTime(), TimeUnit.NANOSECONDS);
	}

}
