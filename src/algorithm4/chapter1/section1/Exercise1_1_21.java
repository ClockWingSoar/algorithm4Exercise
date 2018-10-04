/**
 *  1.1.21 Write a program that reads in lines from standard input with each line containing
 *   a name and two integers and then uses printf() to print a table with a column of the names, 
 *   the integers, and the result of dividing the first by the second, accurate to three decimal 
 *   places. You could use a program like this to tabulate batting averages for baseball players
 *    or grades for students. 
 *   
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_21 {

	/**
	 * @param args
	 */
	 

	   public static void main(String[] args)
	   {
		   //input string could be "abc 2 3 \ndef 3 5 \nghi 8 4"
		   StdOut.printf("%8s %7s %7s %7s","Names","Number1","Number2","Result\n");
		 //when passing from run configuration "arguments",eclipse auto decode \ with \\, 
		   //so here regex needs to be \\\\n
		   String[] inputString = args[0].split("\\\\n");
		   for(String str : inputString) {
		//   StdOut.println(args[0].split("\\\\n")[0]);
		 //  StdOut.println("abc 2 3 \ndef 3 5 \nghi 8 4".split("\\n")[0]);
			   formatInput(str.replace("\\n", ""));
		   }
		   
	   }
	   private static void formatInput(String s) {
		   String[] str = s.split(" ");
		   for(int i = 0; i < str.length; i++) {
			   if (i % 3 != 0)//to align right since Number1 plus space is 8 characters
				   StdOut.printf("%8s", str[i]);
			   else
				   StdOut.printf("%7s", str[i]);
			   if ((i + 1) % 3 == 0) {
				   double d1 = Double.parseDouble(str[i-1]);
				   double d2 = Double.parseDouble(str[i]);
				   double result = d1/d2;
				   StdOut.printf("%7.3f \n", result);
			   }
		   }
	   }


/*	Result:
 *  
	Names Number1 Number2 Result
    abc       2       3  0.667 
    def       3       5  0.600 
    ghi       8       4  2.000 


	*/

}