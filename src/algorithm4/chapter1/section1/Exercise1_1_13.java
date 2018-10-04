/**
 *  1.1.13 Write a code fragment to print the transposition (rows and columns changed) of
 *   a two-dimensional array with M rows and N columns 
 *   
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{3,4,5,6},
				 		{4,5,6,7},
				 		{5,6,7,8},
				 		{6,7,8,9},
				 		{7,8,9,0}};
		StdOut.println("Before transposition:");
		printArray(array);
		StdOut.println("After transposition:");
		transpositArray(array);
	}
	private static void printArray(int[][] array) {
		int rowsLength = array.length;
		int columnsLength = array[0].length;
		for(int i = 0; i < rowsLength; i++)
		{
			for(int j = 0; j < columnsLength; j++)
			{
				StdOut.print(array[i][j]+" ");
			}
			StdOut.println();
		}
		
	}
	private static void transpositArray(int[][] array) {
		int rowsLength = array.length;
		int columnsLength = array[0].length;
		int [][] transArray = new int[columnsLength][rowsLength];
		for(int i = 0; i < rowsLength; i++)
		{
			for(int j = 0; j < columnsLength; j++)
			{
				transArray[j][i] = array[i][j];
			}
		}
		printArray(transArray);
			
	}
/*	Result:
 *  
	Before transposition:
	3 4 5 6 
	4 5 6 7 
	5 6 7 8 
	6 7 8 9 
	7 8 9 0 
	After transposition:
	3 4 5 6 7 
	4 5 6 7 8 
	5 6 7 8 9 
	6 7 8 9 0 
   

	*/

}