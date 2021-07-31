package com.ak.bank.test;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ak.bank.operation.CoustmerOperation;

public class TestViewBalance {

	CoustmerOperation co = new CoustmerOperation();
	
	@Test
	
	public void viewbalance()
	{
		assertNotEquals(4000,co.coustmerbalance(3008));
	}
}
