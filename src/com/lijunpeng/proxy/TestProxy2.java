package com.lijunpeng.proxy;
/** 
 * 动态代理测试类
 * 2018年9月12日
 */
public class TestProxy2 {
	
	public static void main(String[] args) {
		ProxyHandler proxy = new ProxyHandler();
		
	  	Subject subject = (Subject) proxy.bind(new RealSubject());
		subject.doSomething1();
		subject.doSomething2();
		subject.doSomething3();
		subject.doSomething4();
	}
}
