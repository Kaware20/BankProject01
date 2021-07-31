package com.ak.bank.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ak.bank.operation.CoustmerOperation;
public class NegativeTestForDeposite {

	CoustmerOperation co = new CoustmerOperation();

	@Test
    public void testdeposite()
    {
		assertNotEquals(1,co.deposit(3050,5000));
	}
}
