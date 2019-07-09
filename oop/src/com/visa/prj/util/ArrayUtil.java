package com.visa.prj.util;

public class ArrayUtil {

	public static int getSum(int[] data) {
		int sum = 0;

		
		 for (int i = 0; i < data.length; i++) { sum += data[i]; }
		 
		return sum;

	}
//
//	public static void sort(Comparable[] elems) {
//		for (Comparable i = 0; i < elems.length; i++) {
//			for(Comparable j = i + 1; j < elems.length; j++) {
//				if (elems[i].compareTo(elems[j]) > 0) {
//						Comparable temp = elems[i];
//						elems[i] = elems[j];
//						elems[j] = temp;
//				}
//			}
//		}
//	}
//
	public static void sort(int[] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (elems[i] < elems[j]) {
					int temp = elems[i];
					elems[i] = elems[j];
					elems[j] = temp;
				}
			}
		}
	}

	public static int[] convert(int[][] data) {
		int[] temp = new int[data.length * data[0].length];
		int c = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				temp[c] = data[i][j];
				c++;
			}
		}

		return temp;

	}

	/**
	 * method to return number of occurences of "no" in the element
	 * 
	 * @param elems
	 * @param no
	 * @return
	 */

	public static int getCount(int[] elems, int no) {

		int count = 0;

		for (int i = 0; i < elems.length; i++) {
			if (elems[i] == no) {
				count++;
			}
		}
		return count;

	}

}
