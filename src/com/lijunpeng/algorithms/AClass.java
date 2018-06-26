package com.lijunpeng.algorithms;

public class AClass {
	private String id;
	
	
	
	public AClass(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	@Override
	public boolean equals(Object obj) {
		AClass a = (AClass) obj;
		return id == a.id;
	}
}
