package com.lijunpeng.proxy;
/**
 * 真实对象，实现了接口
 * 2018年9月12日
 */
public class RealSubject implements Subject{

	@Override
	public void doSomething1() {
		
		System.out.println("call doSometing1...");
		
	}

	@Override
	public void doSomething2() {
		System.out.println("call doSometing2...");
	}

	@Override
	public void doSomething3() {
		System.out.println("call doSometing3...");
	}

	@Override
	public void doSomething4() {
		System.out.println("call doSometing4...");
	}

}
