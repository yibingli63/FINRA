package com.finra.examples.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * 
 * @author yli
 *
 */

public class PhoneNumberTest {
	private PhoneNumber pn = new PhoneNumber(0, null);
	
	@Before
	public void setUp() throws Exception {
		pn.setId(1);
		pn.setNumber("1ADGJMP");
	}

	@Test
	public void testGetId() {
		assertNotNull(pn.getId());
		assertEquals(1, pn.getId());
		System.out.println("ID: " + pn.getId());
	}

	@Test
	public void testGetNumber() {
		assertNotNull(pn.getNumber());
		assertEquals("1ADGJMP", pn.getNumber());
		System.out.println("Number: " + pn.getNumber());
	}

}
