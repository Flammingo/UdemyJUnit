package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void test() {
		int[] array = {12,1,3,5};
		int[] expected = {1,3,5,12};
		
		Arrays.sort(array);
		
		//assertEquals(expected,array);//  It will check if the object is same hence this check fails
		assertArrayEquals(expected, array);
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testExceptionsNullArray() {
		int[] array = null;
		Arrays.sort(array); //will throw NPE
	}
	
	@Test(expected=NullPointerException.class)
	public void testExceptionsEmptyArray() {
		int[] array = {};
		Arrays.sort(array); //will not throw exception hence test fails
	}
	
	@Test(timeout=100) //in milliseconds
	public void testPerformanceArrays() {
		int[] a = {12, 23, 4};
		for(int i=1; i<100000; i++) {
			a[0] = i;
		}
		Arrays.sort(a);
	}
	

}
