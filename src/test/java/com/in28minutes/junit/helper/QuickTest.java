package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class: Should be static method");
	}

	@Before
	public void setUp() {
		System.out.println("Before");
	}
	@Test
	public void test1() {
		//fail("Not yet implemented");
		System.out.println("Test 1 Executed.");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 Executed.");
	}

	@After
	public void tearDown() {
		System.out.println("After: used to close connections");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class: Should be static method : used to optimize the performance");
	}
}
