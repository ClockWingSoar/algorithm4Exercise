/**
 * 1.1.24 Give the sequence of values of p and q that are computed when Euclid’s algorithm is used
 *  to compute the greatest common divisor of 105 and 24. Extend the code given on page 4 to develop
 *   a program Euclid that takes two integers from the command line and computes their greatest 
 *   common divisor, printing out the two arguments for each call on the recursive method. Use your
 *    program to compute the greatest common divisor of 1111111 and 1234567.
 *  
 */
package algorithm4.chapter1.section1;


import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_24 {

	/**
	 * @param args
	 */
	 

	   public static void main(String[] args)
	   {
		   int result = 0;
		   StdOut.println("=======Computing for 105 and 24=======");
		   result = euclid(105,24);
		   StdOut.println("result is "+result);
		   StdOut.println("=======Computing from command line arguments=======");
		   int arg1, arg2;
		   if(args.length < 2)
			   StdOut.println("Please enter two integer numbers");
		   else
		   {
			   arg1 = Integer.parseInt(args[0]);
			   arg2 = Integer.parseInt(args[1]);
			   result = euclid(arg1,arg2);
			   StdOut.println("result is "+result);
		   }
		   StdOut.println("=======Computing for 1111111 and 1234567=======");
		   result = euclid(1111111,1234567);
		   StdOut.println("result is "+result);
	   }

	   private static int euclid(int p, int q){
		   StdOut.println("computing at "+p+" and "+q);
		   if(q == 0)
			   return  p;
		   else
			   return euclid(q,p % q);
		   
	   }

/*	Result:
 *  
	=======Computing for 105 and 24=======
	computing at 105 and 24
	computing at 24 and 9
	computing at 9 and 6
	computing at 6 and 3
	computing at 3 and 0
	result is 3
	=======Computing from command line arguments=======
	computing at 56 and 24
	computing at 24 and 8
	computing at 8 and 0
	result is 8
	=======Computing for 1111111 and 1234567=======
	computing at 1111111 and 1234567
	computing at 1234567 and 1111111
	computing at 1111111 and 123456
	computing at 123456 and 7
	computing at 7 and 4
	computing at 4 and 3
	computing at 3 and 1
	computing at 1 and 0
	result is 1


	*/

}