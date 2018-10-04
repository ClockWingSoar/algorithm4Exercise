/**
 * 
 *  1.1.5 Write a code fragment that prints true if the double variables x and y are both strictly 
 *   between 0 and 1 and false otherwise.          
 *
 */
package algorithm4.chapter1.section1;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StdOut.println(isBetweenXAndY(0,1,0.6,0.3));
			StdOut.println(isBetweenXAndY(0,1,1.6,1.3));
			StdOut.println(isBetweenXAndY(0,1,1.0,0));
	}
	private static boolean isBetweenXAndY(double x, double y, double a, double b) {
		
		return (isBetweenXAndY(x,y,a) && isBetweenXAndY(x,y,b));
		
		
	}
	private static boolean isBetweenXAndY(double x, double y, double z) {
		if (z >= x && z <= y) {
			StdOut.println(z + " is between " + x +" and " + y);
			return true;
		}else {
			
			StdOut.println(z + " is not between " + x +" and " + y);
			return false;
		}
		
	}
}
