/**
 * 
 * 1.1.4 What (if anything) is wrong with each of the following statements? 
 * a. if (a > b) then c = 0;
 * b. if a > b { c = 0; }
 * c. if (a > b) c = 0;
 * d. if (a > b) c = 0 else b = 0;
 *
 *
 */
package algorithm4.chapter1.section1;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5,b =3,c=4;
//		if (a > b) then c = 0; - then cannot be resolved to a variable
		if (a > b ) c=0;
		StdOut.println("c = "+c);
//		if a > b {c = 0; }- Syntax error on token "if", ( expected after this  token - Syntax error, insert ") Statement" to complete IfStatement
		
		if (a > b) {c = 3;}
		StdOut.println("c = "+c);
//		if (a > b) c = 0 else b = 0; Syntax error, insert ";" to complete Statement
		if (a > b) c = 0; else b = 0;
		StdOut.println("c = "+c+" b = " +b);

	}
}
