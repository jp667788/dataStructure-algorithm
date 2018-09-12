package com.lijunpeng.proxy;
/**
 * 代理类，与真实类继承相同接口
 * 2018年9月12日
 */
public class SubjectProxy implements Subject{
	
	// 持有被代理类（真实类）对象
	Subject subimpl = new RealSubject();
	
	@Override
	public void doSomething1() {
		subimpl.doSomething1();
	}

	@Override
	public void doSomething2() {
		subimpl.doSomething2();
	}

	@Override
	public void doSomething3() {
		subimpl.doSomething3();
	}

	@Override
	public void doSomething4() {
		subimpl.doSomething4();
	}
	
}
