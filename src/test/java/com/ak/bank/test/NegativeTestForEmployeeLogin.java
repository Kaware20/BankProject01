package com.ak.bank.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ak.bank.bean.Employee;
public class NegativeTestForEmployeeLogin {

	Employee co = new Employee();

	@Test
    public void testtransfer()
    {
		assertNotEquals(1,co.checkEmployeeCrediential(1050,"Akay@123"));;
	}
}




