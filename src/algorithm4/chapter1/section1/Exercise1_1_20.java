/**
 *   
 *  1.1.20 Write a recursive static method that computes the value of ln (N!). 
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
public class Exercise1_1_20 {

	/**
	 * @param args
	 */
	 

	   public static void main(String[] args)
	   {
		   int n = 5;
		   StdOut.println( n + "'s factorial - " +factorial(n));
		   StdOut.println("It's natural logarithm - " +Math.log(factorial(n)));
	   }
	   private static int factorial(int n) {
		   if ((n == 0) || (n == 1))
			   return 1;
		   else
			   return n * factorial(n-1);
	   }


/*	Result:
 *  
	5's factorial - 120
	It's natural logarithm - 4.787491742782046

	*/

}