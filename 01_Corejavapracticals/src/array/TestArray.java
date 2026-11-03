package array;

import java.util.Arrays;

public class TestArray {
	// Array is a collection of elements of the same data type stored in contiguous
	// memory locations.

	public static void main(String[] args) {

		int[] a = { 5, 10, 15, 20, 25 , 9 , 6 };
		Arrays.sort(a); 
	

		
		for (int i : a) {
			System.out.println(i);
			
		}

	}
}
