/**
 *   1.1.9 Write a code fragment that puts the binary representation of a positive integer N into a 
 *   String s.
 *   Solution: Java has a built-in method Integer.toBinaryString(N) for this job, but the point of
 *   the exercise is to see how such a method might be implemented. Here is a particularly concise 
 *   solution:
 *   String s = "";
 *   for (int n = N; n > 0; n /= 2)
 *      s = (n % 2) + s;
 *   
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toBinaryString(13);
		toBinaryString2(13);
	}
	private static void toBinaryString(int N) {
		String s = Integer.toBinaryString(N);
		StdOut.println(s);
	}
	private static void toBinaryString2(int N) {
		String s = "";
		for(int i = N; i > 0; i /= 2) {
			s = (i % 2)  + s;
		}
		StdOut.println(s);
	}
/*	Result:
 *  1101
	1101

	*/

}