package com.cruds.calculatordemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		Calc c = new Calc();
		
		assertEquals(10, c.add(5, 5));
	}

	@Test
	public void testSub() {
		Calc c = new Calc();
		
		assertEquals(20, c.sub(25, 5));
	}
	
	@Test
	public void testMultiply() {
		Calc c = new Calc();
		
		assertEquals(25, c.multiply(5, 5));
	}
	
	@Test
	public void testDivide() {
		Calc c = new Calc();
		
		assertEquals(5, c.divide(25, 5));
	}
}
