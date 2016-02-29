package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class ConverterTester {
	static TempConverter _tc;
	
	//execute before class
	@BeforeClass
	public static void before() {
	   System.out.println("in before class");
	   _tc = new TempConverter();
	}

	@Test
	public void CtoFTest(){
		assertEquals("100 C = 212 F : ", 212, _tc.CtoF(212));
	}

	@Test
	public void FtoCTest(){
		assertEquals("212 F = 100 C : ", 100, _tc.FtoC(212));
	}
}
