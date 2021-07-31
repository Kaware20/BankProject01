package com.ak.bank.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ak.bank.operation.CoustmerOperation;
public class TestWithdrawal {

	CoustmerOperation co = new CoustmerOperation();

	@Test
    public void testwithdrawal()
    {
		assertEquals(1,co.withdrawal(3008,500));
	}
}

