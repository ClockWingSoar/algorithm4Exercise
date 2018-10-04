/**
 * 1.1.12 What does the following code fragment print?  
 * int[] a = new int[10];   
 * for (int i = 0; i < 10; i++)   
 *    a[i] = 9 - i;   
 * for (int i = 0; i < 10; i++)   
 *    a[i] = a[a[i]];   
 * for (int i = 0; i < 10; i++)  
 *    System.out.println(a[i]); 
 *   
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray();
	}
	private static void printArray() {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
		   a[i] = 9 - i;
		for (int i = 0; i < 10; i++)
		   a[i] = a[a[i]];//when hits to index 5, it uses the new a[4] value which is 4
		for (int i = 0; i < 10; i++)
		   StdOut.println(a[i]);

			
	}
/*	Result:
 *  
	0
	1
	2
	3
	4
	4
	3
	2
	1
	0
   

	*/

}