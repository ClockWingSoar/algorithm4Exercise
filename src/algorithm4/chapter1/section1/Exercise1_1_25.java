/**
 *  1.1.25 Use mathematical induction to prove that Euclid’s algorithm computes the greatest
 *   common divisor of any pair of nonnegative integers p and q.
 *  
 *  
 */
package algorithm4.chapter1.section1;


import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_25 {

	/**
	 * @param args
	 */
	 

	   public static void main(String[] args)
	   {
		   
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
https://www.whitman.edu/mathematics/higher_math_online/section03.03.html
Lemma 3.3.1 Suppose a and b
are not both zero.
    a) (a,b)=(b,a)
	b) if a>0 	and a|b then (a,b)=a
	c) if a≡c(mod b), then (a,b)=(c,b)

Proof.
Part (a) is clear, since a common divisor of a and b is a common divisor of b and a. For part (b), 
note that if a|b, then a is a common divisor of a and b. Clearly a is the largest divisor of a, 
so we are done. Finally, if a≡c(modb), then b|a−c, so there is a y such that a−c=by, i.e., c=a−by. 
If d divides both a and b, then it also divides a−by. Therefore any common divisor of a and b is
also a common divisor of c and b. Similarly, if d divides both c and b, then it also divides c+by=a,
so any common divisor of c and b is a common divisor of a and b. This shows that the common divisors
of a and b are exactly the common divisors of c and b, so, in particular, they have the same
greatest common divisor. 


	*/

}