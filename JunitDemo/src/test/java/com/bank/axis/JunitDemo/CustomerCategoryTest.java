/**
 * Aj(CompanyName)
 * Aug 24, 2022
 * 
 */
package com.bank.axis.JunitDemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class CustomerCategoryTest {
	@Test
	public void testStatus() {
		CustomerCategory customer = new CustomerCategory();
		assertTrue(customer.getStatus(1));
		
	}

	@Test
	public void testCategory() {
		final CustomerCategory customer = new CustomerCategory();
		assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			public void run() throws Throwable {
				customer.getCustomerCategory(-1);
			}
		});
	}

}
