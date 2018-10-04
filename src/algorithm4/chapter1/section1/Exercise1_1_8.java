/**
 *   1.1.8 What do each of the following print?
 *   a. System.out.println('b');
 *   b. System.out.println('b' + 'c');
 *   c. System.out.println((char) ('a' + 4));
 *   Explain each outcome.
 *   
 *   
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println('b');              
		StdOut.println('b' + 'c');        
		StdOut.println("b" + "c");        
		StdOut.println((char) ('a' + 4)); 
	}
/*	Result:
 *  b
	197
	bc
	e

	*/

}