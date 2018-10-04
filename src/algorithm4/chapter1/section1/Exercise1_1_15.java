/**
 *   1.1.15 Write a static method histogram() that takes an array a[] of int values and an 
 *   integer M as arguments and returns an array of length M whose ith entry is the number 
 *   of times the integer i appeared in the argument array. If the values in a[] are all 
 *   between 0 and M−1, the sum of the values in the returned array should be equal to a.length.
 *   
 *   
 *   
 */
package algorithm4.chapter1.section1;

import algorithm4.tools.ArrayTools;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] arrA = {3,4,5,3,3,5};
		ArrayTools.printArray(histogram(arrA,6));
		int[] arrB = {1,2,3,2,8};
		ArrayTools.printArray(histogram(arrB,6));
		
	}
	private static int[] histogram(int[] a, int M) {
		int[] arr = new int[M];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < M) {
				
				arr[a[i]]++;//calculate the accounts of same value in a[] and put it in arr[] using
							//a[i] as its index
			}
		}
		return arr;
	}
/*	Result:
 *  
	0 0 0 3 1 2 
	0 1 2 1 0 0 

	*/

}