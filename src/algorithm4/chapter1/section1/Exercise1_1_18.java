/**
 *  1.1.18 Consider the following recursive function:
 *  Click here to view code image
 *  public static int mystery(int a, int b)
 *  {
 *     if (b == 0) return 0;
 *     if (b % 2 == 0) return mystery(a+a, b/2);
 *     return mystery(a+a, b/2) + a;
 *  }
 *  What are the values of mystery(2, 25) and mystery(3, 11)? Given positive integers a and b, 
 *  describe what value mystery(a, b) computes. Answer the same question, but replace the 
 *  three + operators with * and replace return 0 with return 1.
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
public class Exercise1_1_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		StdOut.println(mystery(2,25));
		StdOut.println(mystery(3,11));
		StdOut.println(mystery2(2,25));
		StdOut.println(mystery2(3,11));
	}
	public static int mystery(int a, int b)
	{
	   if (b == 0) return 0;
	   if (b % 2 == 0) return mystery(a+a, b/2);
	   return mystery(a+a, b/2) + a;
	}
	public static int mystery2(int a, int b)
	{
		if (b == 0) return 1;
		if (b % 2 == 0) return mystery(a*a, b/2);
		return mystery(a*a, b/2) * a;
	}


/*	Result:
 *  mystery(a,b) computes a * b
 *  mystery2(a,b) computes a^b
	50
	33
	96
	135

	*/

}