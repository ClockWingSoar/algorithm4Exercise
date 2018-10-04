/**
 * 1.1.10 What is wrong with the following code fragment?   
 * int[] a;   
 * for (int i = 0; i < 10; i++)   
 *    a[i] = i * i;   
 * Solution: It does not allocate memory for a[] with new. This code results in a variable a might
 *  not have been initialized compile-time error.   
 *    
 *    
 *   
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] a = null;Exception in thread "main" java.lang.NullPointerException
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
		   a[i] = i * i;//The local variable a may not have been initialized
		   StdOut.println(a[i]);
		}
	}
/*	Result:
 *  0
	1
	4
	9
	16
	25
	36
	49
	64
	81


	*/

}