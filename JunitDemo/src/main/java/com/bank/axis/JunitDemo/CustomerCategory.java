/**
 * Aj(CompanyName)
 * Aug 24, 2022
 * 
 */
package com.bank.axis.JunitDemo;

public class CustomerCategory {
	public boolean getStatus(int value) {
		if (value == 1)
			return true;
		else
			return false;
	}

	public void getCustomerCategory(int transactionPoints) {
		String customerType;
		if (transactionPoints < 0)
			throw new IllegalArgumentException();
		else if (transactionPoints < 5)
			customerType = "NC";
		else if (transactionPoints < 10)
			customerType = "BC";
		else if (transactionPoints < 15)
			customerType = "DC";
		else
			customerType = "VC";
	}

}
