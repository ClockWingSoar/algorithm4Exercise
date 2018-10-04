/**
 *   1.1.6 What does the following program print?
 *   int f = 0;
 *   int g = 1;
 *   for (int i = 0; i <= 15; i++)
 *   {
 *      StdOut.println(f); 
 *      f = f + g; 
 *      g = f - g;
 *   }
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			StdOut.println(f);//to print the sum of the new f value and old f value
			f = f + g;//to get the new f value
			g = f - g;//to restore the old f value
		}

	}
}