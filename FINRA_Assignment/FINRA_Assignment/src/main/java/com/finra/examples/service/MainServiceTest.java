package com.finra.examples.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * 
 * @author yli
 *
 */

public class MainServiceTest {
	
	public PhoneNumber pn10 = new PhoneNumber(0, null);
	public MainService ms = new MainService();
	public List<Object> list10 = new ArrayList<Object>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {				
		String pn10 = "2403866106";
		list10 = ms.PrintStrings(pn10);
		System.out.println("10-char= " + list10.size());
	}

	@Test
	public void testPrintStrings(){				
		//Test total combination number for 10-digit number
		assertEquals(2187, list10.size());
		System.out.println("Total conmbination number for 10-digit input: " + list10.size());
		
		//Fetch first number				
		pn10 = (PhoneNumber) list10.get(0);
		
		assertEquals("AG0DTMM10M", pn10.getNumber());
		System.out.println("First id= " + pn10.getId() + " and " + "First number= " + pn10.getNumber());
		
		//Fetch last number
		pn10 = (PhoneNumber) list10.get(list10.size()-1);
		
		assertEquals("CI0FVOO10O", pn10.getNumber());
		System.out.println("Last id= " + pn10.getId() + " and " + "Last number= " + pn10.getNumber());
				
	}

}
