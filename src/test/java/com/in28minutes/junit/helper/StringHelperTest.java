package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	//Donot have 2 cond in same test
	//Any Test Method Should be Void and Public
	
	StringHelper helper;
	
	@Before
	public void setUp() {
		System.out.println("Before");
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2PositionsCondition1() {
		// fail("Not yet implemented"); fails the test
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD")); //expected, actual
	}
	
	@Test
	public void testTruncateAInFirst2PositionsCondition2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD")); //expected, actual
	}
	
	//ABCD => false, ABAB => true, AB => true, A => false
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegScenario() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegScenarioNeg() {
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

}
