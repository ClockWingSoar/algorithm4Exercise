/**
 * 
 * 1.1.3 Write a program that takes three integer command-line arguments and prints equal 
 *  if all three are equal, and not equal otherwise.
 *
 *
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
public class Exercise1_1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 3)
			System.out.println("You need to input three integer numbers");
		else {
				int arguA = Integer.parseInt(args[0]);
				int arguB = Integer.parseInt(args[1]);
				int arguC = Integer.parseInt(args[2]);
				if (arguA == arguB && arguA == arguC)
					System.out.println("They are all equal");
				else
					System.out.println("They are not equal");
				//extract the equal method as isEqual() and using the StdOut class from algs4.jar
				isEqual(arguA, arguB, arguC);
			}
		}
		private static void isEqual(int arguA, int arguB, int arguC) {
			if (arguA == arguB && arguB == arguC)
				StdOut.println("equal");
			else
				StdOut.println("not equal");
		}
		
		



}
