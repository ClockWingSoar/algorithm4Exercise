/**
 *  1.1.23 Add to the BinarySearch test client the ability to respond to a second argument:
 *   + to print numbers from standard input that are not in the whitelist, - to print numbers
 *    that are in the whitelist.
 *   
 */
package algorithm4.chapter1.section1;

import java.util.Arrays;

import algorithm4.tools.ArrayTools;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_23 {

	/**
	 * @param args
	 */
	 

	   public static void main(String[] args)
	   {
		   int[] whitelist = {1,7,2,3,5,6,7,8,9};
		   int[] numbers = {1,7,22,3,4,33};
		   Arrays.sort(whitelist);
		   StdOut.print("whitelist is ");
		   ArrayTools.printArray(whitelist);
		   StdOut.print("numberlist is ");
		   ArrayTools.printArray(numbers);
		   binarySearch(whitelist,numbers,'+');
		   binarySearch(whitelist,numbers,'-');
	   }

	   private static void binarySearch(int[] whitelist, int[] numbers, char operation) {
		   if(operation == '+')
			   StdOut.println("below numbers are in the whitelist");
		   else
			   StdOut.println("below numbers are not in the whitelist");
		   int count = 0;//to remove the last comma character in the list
		   for(int i = 0; i < numbers.length; i++)
		   {
			   if(rank(numbers[i],0,whitelist.length-1,whitelist) != -1 && operation == '+') {
				   if(count != 0)
				   		StdOut.print(",");
				   StdOut.print(numbers[i]);
				   count++;
			   }
			   else if (rank(numbers[i],0,whitelist.length-1,whitelist) == -1 && operation == '-') {
				   if(count != 0)
					   StdOut.print(",");
				   StdOut.print(numbers[i]);
				   count++;
			   }
				   
		   }
		   StdOut.println();
	   }

	   private static int rank(int key,int lo, int hi, int[] arr) {
		   if (lo <= hi) {
			   int mid = lo + (hi-lo)/2;
			   if(key > arr[mid]) {
				   lo = mid + 1;
				   return rank(key,lo,hi,arr);
			   }
			   else if(key < arr[mid]) {
				   hi = mid -1;
				   return rank(key,lo,hi,arr);
			   }
			   else
			   {
				   return mid;
			   }
		   }
		   return -1;
	   }
/*	Result:
 *  
	whitelist is 1 2 3 5 6 7 7 8 9 
	numberlist is 1 7 22 3 4 33 
	below numbers are in the whitelist
	1,7,3
	below numbers are not in the whitelist
	22,4,33



	*/

}