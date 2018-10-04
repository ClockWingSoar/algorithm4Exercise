/**
 * 1.1.26 Sorting three numbers. Suppose that the variables a, b, c, and t are all of the same 
 * numeric primitive type. Show that the following code puts a, b, and c in ascending order:  
 * if (a > b) { t = a; a = b; b = t; }  
 * if (a > c) { t = a; a = c; c = t; }  
 * if (b > c) { t = b; b = c; c = t; } 
 * 
 */
package algorithm4.chapter1.section1;


import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_26 {

	/**
	 * @param args
	 */
	 

	   public static void main(String[] args)
	   {
		   sort(2,5,3);
		   
	   }

	   private static void sort(int a, int b, int c){
		   StdOut.println("before sorting - "+ a +" "+b +" "+c);
		   int t = 0;
		   if (a > b) {
			   t = a;
			   a = b;
			   b = t;
		   }
		   if(b > c) {
			   t = b;
			   b = c;
			   c = t;
		   }
		   if (a > c) {
			   t = c;
			   c = a;
			   a = t;
		   }
		   StdOut.println("after sorting - "+ a +" "+b +" "+c);
	   }

/*	Result:
 *  
	before sorting - 2 5 3
	after sorting - 2 3 5

	*/

}