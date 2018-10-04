/**
 *  1.1.14 Write a static method lg() that takes an int value N as argument and returns the 
 *  largest int not larger than the base-2 logarithm of N. Do not use Math. 
 *   
 *   
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println(lg(33));
	}
	private static int lg(int N) {
		int result = 0;
		while( N > 1) {
			result++;
			N = N / 2;
		}
		
		return result;
	}
/*	Result:
 *  
	5
   

	*/

}