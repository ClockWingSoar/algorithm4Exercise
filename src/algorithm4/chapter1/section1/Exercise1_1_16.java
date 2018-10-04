/**
 *  1.1.16 Give the value of exR1(6):  
 *  public static String exR1(int n)  
 *  {  
 *     if (n <= 0) return "";  
 *     return exR1(n-3) + n + exR1(n-2) + n; 
 *  } 
 *  
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int i = 0;
		while(i < 7) {
		StdOut.println(exR1(i));
		i++;
		}
	}
	public static String exR1(int n)
	{
	   if (n <= 0) return "";
	   return exR1(n-3) + n + exR1(n-2) + n;
	}

/*	Result:
 *  
	
	11
	22
	3113
	114224
	22531135
	311361142246

	*/

}