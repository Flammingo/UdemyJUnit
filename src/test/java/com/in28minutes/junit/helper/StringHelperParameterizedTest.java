package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) // **1st define the that this is a Parameterized test and not normal
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	
	//** 3rd Create a param constructor
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		//super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	// **2nd Define the collection with Parameter annotation
	@Parameters
	public static Collection<String[]> testConditions() {
		
		String expectedInputOutputPairs[][] = {{"AACD","CD"}, {"ACD","CD"},{"AAD","CD"}};
		return Arrays.asList(expectedInputOutputPairs);
	}
	
	@Test
	public void testTruncateAInFirst2PositionsCondition1() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input)); //expected, actual
	}
}
