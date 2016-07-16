package com.akeru.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void divide(){

		App tester = new App();
		
		assertEquals("1/1 must be 1", 1, tester.divide(1, 1));
		
	}
}
