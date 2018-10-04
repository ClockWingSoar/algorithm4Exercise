/**
 * 1.1.17 Criticize the following recursive function: 
 * Click here to view code image 
 * public static String exR2(int n) 
 * { 
 *    String s = exR2(n-3) + n + exR2(n-2) + n; 
 *    if (n <= 0) return ""; 
 *    return s; 
 * } 
 * Answer: The base case will never be reached. A call to exR2(3) will result in calls to exR2(0),
 *  exR2(-3), exR3(-6), and so forth until a StackOverflowError occurs.  
 *  
 *  
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int i = 0;
		while(i < 7) {
		StdOut.println(exR2(i));
		i++;
		}
	}
	public static String exR2(int n)
	{
	   String s = exR2(n-3) + n + exR2(n-2) + n;
	   if (n <= 0) return "";
	   return s;
	}

/*	Result:
 *  The function never stops because it keeps calling itself on the first line,
 *   until a StackOverflowError occurs.
	Exception in thread "main" java.lang.StackOverflowError
	at algorithm4.chapter1.section1.Exercise1_1_17.exR2(Exercise1_1_17.java:39)
	at algorithm4.chapter1.section1.Exercise1_1_17.exR2(Exercise1_1_17.java:39)
	at algorithm4.chapter1.section1.Exercise1_1_17.exR2(Exercise1_1_17.java:39)
	at algorithm4.chapter1.section1.Exercise1_1_17.exR2(Exercise1_1_17.java:39)
	...

	*/

}