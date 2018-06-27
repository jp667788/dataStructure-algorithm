package com.lijunpeng.extend;

public class AClass {
	
	static {
		System.out.println("父类静态块");
	}
	
	{
		System.out.println("父类构造块");
	}
	
	public AClass() {
		System.out.println("父类构造方法");
	}
	
	public void methodA() {
		System.out.println("父类方法A");
	}
	
	public void methodB() {
		System.out.println("父类方法B调用：");
		this.methodA();
	}
	
}
