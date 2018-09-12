package com.lijunpeng.proxy;
/**
 * 静态代理测试类
 * 2018年9月12日
 */
public class TestProxy {
	public static void main(String[] args) {
		// 获取代理类
		SubjectProxy proxy = new SubjectProxy();
		
		proxy.doSomething1();
		proxy.doSomething2();
		proxy.doSomething3();
		proxy.doSomething4();
	}
}
