/**
 *  1.1.22 Write a version of BinarySearch that uses the recursive rank() given on page 25 and 
 *  traces the method calls. Each time the recursive method is called, print the argument values 
 *  lo and hi, indented by the depth of the recursion. Hint: Add an argument to the recursive 
 *  method that keeps track of the depth. 
 *   
 *   
 */
package algorithm4.chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_22 {

	/**
	 * @param args
	 */
	 

	   public static void main(String[] args)
	   {
		   int[] arr = {1,7,2,3,5,6,7,8,9};
		   Arrays.sort(arr);
		  StdOut.println("key is in index-" + rank(3,arr));
		  StdOut.println("key is in index-" +rank(1,arr));
		  StdOut.println("key is in index-" + rank(3,0,arr.length-1,arr,0));
	   }

	   private static int rank(int key, int[] arr) {
		   int lo = 0;
		   int hi = arr.length - 1;
		   int depth = 0;
		   while(lo <= hi) {
			   int mid = lo + (hi - lo)/2;
			   if(key > arr[mid]) lo = mid+1;
			   else if(key < arr[mid]) hi = mid-1;
			   else
				   return mid;
			   depth++;
			   for(int i = 0; i < depth; i++)
				   StdOut.print(" ");
			   StdOut.println("lo ="+lo+" hi ="+hi);
		   }
		   return -1;
	   }

	   private static int rank(int key,int lo, int hi, int[] arr, int depth) {
		   if(depth != 0)
			   StdOut.println();
		   for(int i = 0; i <= depth; i++)
			   StdOut.print(" ");
		   StdOut.print("lo ="+lo+" hi ="+hi);
		   if (lo <= hi) {
			   int mid = lo + (hi-lo)/2;
			   if(key > arr[mid]) {
				   lo = mid + 1;
				   return rank(key,lo,hi,arr, ++depth);
			   }
			   else if(key < arr[mid]) {
				   hi = mid -1;
				   return rank(key,lo,hi,arr, ++depth);
			   }
			   else
			   {
				   StdOut.println();
				   return mid;
			   }
		   }
		   return -1;
	   }
/*	Result:
 *  
	 lo =0 hi =3
	  lo =2 hi =3
	key is in index-2
	 lo =0 hi =3
	  lo =0 hi =0
	key is in index-0
	 lo =0 hi =8
	  lo =0 hi =3
	   lo =2 hi =3
	key is in index-2



	*/

}