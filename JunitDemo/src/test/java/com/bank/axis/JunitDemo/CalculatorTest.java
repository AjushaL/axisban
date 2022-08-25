package com.bank.axis.JunitDemo;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void testSumTwoAndTwoIsFour() {
		assertEquals(4, calculator.sum(2, 2));
	}
	@Test
	public void testSumFiveAndThreeIsEight() {
		assertEquals(8,calculator.sum(5, 3));
	}

}
