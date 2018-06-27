package com.lijunpeng.extend;

public class BClass extends AClass{
	static {
		System.out.println("子类静态块");
	}
	{
		System.out.println("子类构造块");
	}
	public BClass() {
		System.out.println("子类构造方法");
	}
	
	@Override
	public void methodA() {
		System.out.println("子类重写父类方法A");
	}
	
	public static void main(String[] args) {
		AClass bClass = new BClass();
		bClass.methodB();
		
	}
}
