/**
 *  1.1.19 Run the following program on your computer:
 *  Click here to view code image
 *  public class Fibonacci
 *  {
 *     public static long F(int N)
 *     {
 *        if (N == 0) return 0;
 *        if (N == 1) return 1;
 *        return F(N-1) + F(N-2);
 *     }
 *  
 *     public static void main(String[] args)
 *     {
 *        for (int N = 0; N < 99; N++)
 *           StdOut.println(N + " " + F(N));
 *     }
 *  }
 *  What is the largest value of N for which this program takes less than 1 hour to compute the
 *   value of F(N)? Develop a better implementation of F(N) that saves computed values in an array.
 *  
 */
package algorithm4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_19 {

	/**
	 * @param args
	 */
	 

	   public static void main(String[] args)
	   {
		  int N = 99;
		  long[] arr;
	      for ( int i = 0; i < N; i++) {
	    	  if (i == 0) {
	    		  arr = new long[1];
	    	  }
	    	  else if (i == 1)
	    	  {
	    		  arr = new long[2];
	    	  }
	    	  else
	    		  arr = new long[i+1];
	    	  
	    	  arr[0] = 0; 
	    	  if(i > 0)//only when i > 0 it can initialize arr[1], otherwise arrayindexoutofbound
	    		  arr[1] = 1; 
	    	  
	    	  StdOut.println(i + "-" + enhancedF(arr));
	    	  
//	         StdOut.println(N + " " + F(N));
	      }
	   }
	   public static long F(int N)
	   {
	      if (N == 0) return 0;
	      if (N == 1) return 1;
	      return F(N-1) + F(N-2);
	   }

	   public static long enhancedF(long[] arr)
	   {
		   int n = arr.length;
		   if (n == 1) return arr[0];
		   if (n == 2) return arr[1];
		   for(int i = 2; i < n; i++)//i is index, n is length 
			   arr[i] = arr[i-1] + arr[i-2];
		   return arr[n-1];//n is using as index(n-1) while return, cause i is local variable,
		   					//can't be reached here
	   }


/*	Result:
 *  
	0-0
	1-1
	2-1
	3-2
	4-3
	5-5
	6-8
	7-13
	8-21
	9-34
	10-55
	11-89
	12-144
	13-233
	14-377
	15-610
	16-987
	17-1597
	18-2584
	19-4181
	20-6765
	21-10946
	22-17711
	23-28657
	24-46368
	25-75025
	26-121393
	27-196418
	28-317811
	29-514229
	30-832040
	31-1346269
	32-2178309
	33-3524578
	34-5702887
	35-9227465
	36-14930352
	37-24157817
	38-39088169
	39-63245986
	40-102334155
	41-165580141
	42-267914296
	43-433494437
	44-701408733
	45-1134903170
	46-1836311903
	47-2971215073
	48-4807526976
	49-7778742049
	50-12586269025
	51-20365011074
	52-32951280099
	53-53316291173
	54-86267571272
	55-139583862445
	56-225851433717
	57-365435296162
	58-591286729879
	59-956722026041
	60-1548008755920
	61-2504730781961
	62-4052739537881
	63-6557470319842
	64-10610209857723
	65-17167680177565
	66-27777890035288
	67-44945570212853
	68-72723460248141
	69-117669030460994
	70-190392490709135
	71-308061521170129
	72-498454011879264
	73-806515533049393
	74-1304969544928657
	75-2111485077978050
	76-3416454622906707
	77-5527939700884757
	78-8944394323791464
	79-14472334024676221
	80-23416728348467685
	81-37889062373143906
	82-61305790721611591
	83-99194853094755497
	84-160500643816367088
	85-259695496911122585
	86-420196140727489673
	87-679891637638612258
	88-1100087778366101931
	89-1779979416004714189
	90-2880067194370816120
	91-4660046610375530309
	92-7540113804746346429
	93--6246583658587674878
	94-1293530146158671551
	95--4953053512429003327
	96--3659523366270331776
	97--8612576878699335103
	98-6174643828739884737

	*/

}