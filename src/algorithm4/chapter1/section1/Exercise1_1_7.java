/**
 *   1.1.7 Give the value printed by each of the following code fragments:
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
public class Exercise1_1_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//part a
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
			t = (9.0/t + t) / 2.0;
		StdOut.printf("%.5f\n", t);

		//part b
		int sum = 0;
		for ( int i = 1; i < 1000; i++) 
			for (int j = 0; j < i; j++)
				sum++;
			StdOut.println(sum);
		//part c
		int sum2 = 0;
		for ( int i = 1; i < 1000; i*=2) 
			for (int j = 0; j < 1000; j++)
				sum2++;
			StdOut.println(sum2);
	}
/*	Result:
 *  3.00009
	499500
	10000
	*/

}