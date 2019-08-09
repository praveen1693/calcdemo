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
	
}
