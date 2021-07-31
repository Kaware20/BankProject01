package com.ak.bank.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ak.bank.operation.CoustmerOperation;
public class NegativeTestForWithdrawal {

	CoustmerOperation co = new CoustmerOperation();

	@Test
    public void testdeposite()
    {
		assertNotEquals(1,co.withdrawal(3050,5000));
	}
}

