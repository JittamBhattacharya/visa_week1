package com.visa.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetSum() {
		
		int[] data = {5,4,3,2,1,10};
		int expected = 25;
		
		assertEquals(expected , ArrayUtil.getSum(data));
		
	}

	@Test
	public void testSort() {
		int[] data = {734,2,27,26,88};
		int[] expected = {2,26,27,88,734};
		ArrayUtil.sort(data);
		assertArrayEquals(expected , data);
	}

	@Test
	public void testGetCount() {
		int[] data = {66,2,66,23,55,66};
		int expected = 3;
		assertEquals(expected , ArrayUtil.getCount(data, 66));
	}
	
	@Test
	public void testconvert() {
		int[][] data = {{1,2},{3,4}};
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected , ArrayUtil.convert(data));
	}

}

		
		
		