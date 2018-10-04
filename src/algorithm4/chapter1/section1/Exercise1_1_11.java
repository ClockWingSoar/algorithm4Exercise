/**
 *  1.1.11 Write a code fragment that prints the contents of a two-dimensional boolean array, 
 *  using * to represent true and a space to represent false. Include row and column numbers.
 *  
 *   
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] arr = {{true,true,true,true},
							{false,true,true,true},
							{false,false,true,true},
							{false,false,false,true},
							{false,false,false,false},};
		printArray(arr);
	}
	private static void printArray(boolean[][] arr) {
		int lenOfRow = arr.length;
		int lenOfColumn = 0;
		if (lenOfRow <= 0)
			StdOut.println("please initialize the array");
		else
		 lenOfColumn = arr[0].length;
		for(int i = 0; i < lenOfRow; i++) {
			StdOut.print("Row "+(i+1) +":");
			for(int j = 0; j < lenOfColumn; j++) {
				if(arr[i][j])
					StdOut.print("*");
				else
					StdOut.print(" ");
				
			}
			StdOut.println();
		}
			
	}
/*	Result:
 *  
	Row 1:****
	Row 2: ***
	Row 3:  **
	Row 4:   *
	Row 5:    

	*/

}