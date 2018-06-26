package com.lijunpeng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestTry {
	
	public static void main(String[] args) {
		
		try (InputStream is1 = new FileInputStream(new File("/file1"))) {
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
