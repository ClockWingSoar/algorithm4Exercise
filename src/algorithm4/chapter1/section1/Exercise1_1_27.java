/**
 * 1.1.27 Binomial distribution. Estimate the number of recursive calls that would be used by the 
 * code  
 * public static double binomial(int N, int k, double p) 
 * { 
 *    if ((N == 0) && (k == 0)) return 1.0; 
 *    if ((N  < 0) || (k  < 0)) return 0.0;
 *    return (1 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
 * }
 * to compute binomial(100, 50, 0.25). Develop a better implementation that is based on saving 
 * computed values in an array.
 * 
 * 
 * 
 */
package algorithm4.chapter1.section1;


import edu.princeton.cs.algs4.StdOut;

/**
 * @author YIXIANGZhong
 *
 */
public class Exercise1_1_27 {

	/**
	 * @param args
	 */
	   static int count = 0;

	   public static void main(String[] args)
	   {
//		  StdOut.println(binomial(3, 1, 0.25));
		   int N = 100;
		   int k = 50;
		   double p = 0.25;
		   double[][] arr = new double[N + 1][k + 1];
		   for(int i = 0; i <= N; i++) {
			   for(int j = 0; j <= k; j++) {
				   arr[i][j] = -1;
			   }
		   }
		   StdOut.println(binomial2(N, k, p, arr));
		   
	   }

	   public static double binomial(int N, int k, double p)
	   {
		   StdOut.println(++count);
	      if ((N == 0) && (k == 0)) return 1.0;
	      if ((N  < 0) || (k  < 0)) return 0.0;
	      return (1 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
	   }

/*
 * binomial(1, 1, 0.25)===============================================
count =1, N =1,k=1,  (1 - p)*binomial(0,1,p)+p*binomial(N-1,k-1,p)
count =2, N =0,k=1,  (1 - p)*binomial(-1,1,p)+p*binomial(N-1,k-1,p)
count =3, N =-1,k=1, return 0;
count =2, N =0,k=1,  (1 - p)*0+p*binomial(-1,0,p)
count =4, N =-1,k=0, return 0;
count =2, N =0,k=1, return 0*0.75+0*0.25;
count =1, N =1,k=1, (1 - p)*0+p*binomial(0,0,p);
count =5, N =0, N=0, return 1;
count =1, N =1, k=1,0*0.75+1*0.25=0.25
binomial(2, 1, 0.25)===============================================
count =1, N =2,k=1,  (1 - p)*binomial(1,1,p)+p*binomial(N-1,k-1,p)
count =2, N =1,k=1,  (1 - p)*binomial(0,1,p)+p*binomial(N-1,k-1,p)
count =3, N =0,k=1,  (1 - p)*binomial(-1,1,p)+p*binomial(N-1,k-1,p)
count =4, N =-1,k=1,  return 0;
count =3, N =0,k=1,  0.75*0+p*binomial(-1,0,p)
count =5, N =-1,k=0,  return 0;
count =3, N =0,k=1, 0.75*0+0.25*0;
count =2, N =1,k=1, 0.75*0+p*binomial(0,0,p);
count =6, N =0, k=0, return 1;
count =2, N =1, k=1,return (0+1*0.25)
count =1, N =2, k=1, 0.75*0.25+p*binomial(1,0,p)
count =7, N =1, k=0, (1 - p)*binomial(0,0,p)+p*binomial(N-1,k-1,p)
count =8, N =0, k=0, return 1
count =7, N =1, k=0, 0.75*1+p*binomial(0,-1,p)
count =9, N =0, k=-1, return 0
count =7, N =1, k=0, return 0.75 *1 +p*0
count =1, N =2, k=1, 0.75*0.25+.0.25 *0.75 = 0.375
binomial(3, 1, 0.25)===============================================
count =1, N =3,k=1,  (1 - p)*binomial(2,1,p)+p*binomial(N-1,k-1,p)
count =2, N =2,k=1,  (1 - p)*binomial(1,1,p)+p*binomial(N-1,k-1,p)
count =3, N =1,k=1,  (1 - p)*binomial(0,1,p)+p*binomial(N-1,k-1,p)
count =4, N =0,k=1,  (1 - p)*binomial(-1,1,p)+p*binomial(N-1,k-1,p)
count =5, N =-1,k=1,  return 0;
count =4, N =0,k=1,  (1 - p)*0+p*binomial(-1,0,p)
count =6, N =-1,k=0, return 0;
count =4, N =0,k=1, 0.75*0+p*0;(return 0;)
count =3, N =1, k=1, (1 - p)*0+p*binomial(0,0,p)
count =7, N =0, k=0,return (0+1*0.25)
count =3, N =1, k=1, 0.75*0+1*0.25;(return 0.25;)
count =2, N =2, k=1, 0.75*0.25+p*binomial(1,0,p)
count =8, N =1, k=0, (1 - p)*binomial(0,0,p)+p*binomial(N-1,k-1,p)
count =9, N =0, k=0, 0.75*1;(return 0.75;)
count =8, N =1, k=0, 0.75+p*binomial(0,-1,p)
count =10, N =0, k=-1, 0.75 *1 +p*0(return 0.75;)
count =8, N =1, k=0, 0.75+0.25 *0 (return 0.75;)
count =2, N=2, k=1, 0.75*0.25+0.25*0.75;return(0.375;)
count =1, N=3, k=1, (1 - p)*0.375+p*binomial(2,0,p)
count =11, N=2,k=0, (1 - p)*binomial(1,0,p)+p*binomial(N-1,k-1,p)
count =12, N=1,k=0, (1 - p)*binomial(0,0,p)+p*binomial(N-1,k-1,p)
count =13, N=0,k=0, return 1;
count =12, N=1, k=0, 0.75*1+0.25*binomial(0,-1,p)
count =14, N=0, k=-1, return 0;
count =12, N=1, k=0, 0.75*1+0.25*0; return 0.75;
count =11, N=2, k=0, 0.75*0.75+p*binomial(1,-1,p);
count =15, N=1, k=-1, return 0;
count =11, N=2, k=0, 0.75*0.75+0.25*0; return 0.5625;
count =1, N=3, k=1, 0.75*0.375+0.25*0.5625 ->return 0.28125+0.140625->return 0.421875;

Further analysis(remove recursive call):
count =1, N =3,k=1,  (1 - p)*binomial(2,1,p)+p*binomial(N-1,k-1,p)
count =2, N =2,k=1,  (1 - p)*binomial(1,1,p)+p*binomial(N-1,k-1,p)
count =3, N =1,k=1,  (1 - p)*binomial(0,1,p)+p*binomial(N-1,k-1,p)
count =4, N =0,k=1,  (1 - p)*binomial(-1,1,p)+p*binomial(N-1,k-1,p)
count =5, N =-1,k=1,  return 0;
count =6, N =-1,k=0, return 0;
count =7, N =0, k=0,return (0+1*0.25)
count =8, N =1, k=0, (1 - p)*binomial(0,0,p)+p*binomial(N-1,k-1,p)
count =9, N =0, k=0, 0.75*1;(return 0.75;)
count =10, N =0, k=-1, 0.75 *1 +p*0(return 0.75;)
count =11, N=2,k=0, (1 - p)*binomial(1,0,p)+p*binomial(N-1,k-1,p)
count =12, N=1,k=0, (1 - p)*binomial(0,0,p)+p*binomial(N-1,k-1,p)
count =13, N=0,k=0, return 1;
count =14, N=0, k=-1, return 0;
count =15, N=1, k=-1, return 0;

looking for duplicate (N,k) , ignore all basic computing(just return 0 or 1 or other numbers,
no further recursive calls)
by looking at it, from count 8 to count 10,  from count 12 to count 14
are duplicate activities. by assign it to a array, can avoid such duplication calculation. hence 
enhance the algorithm when the argument are big.
*/
	   private static double binomial2(int N, int k, double p, double[][] arr) {
		   StdOut.println(++count);
		   if((N == 0) && (k == 0)) return 1.0;
		   if((N ==-1) || (k == -1)) return 0;
		   if(arr[N][k] == -1) {
			   arr[N][k] = (1 - p)*binomial2(N-1,k,p,arr) + p*binomial2(N-1, k-1, p, arr);
		   }
		   return arr[N][k];
	   }
   /*
 * count=1,arr[2][1]=0.75*binomial2(arr,1,1,p)+0.25*(binomial2(arr,1,0,p)
 * count=2,arr[1][1]=0.75*binomial2(arr,0,1,p)+0.25*(binomial2(arr,0,0,p)
 * count=3,arr[0][1]=0.75*binomial2(arr,-1,1,p)+0.25*(binomial2(arr,-1,0,p)
 1* count=4, return 0 to count 3
 * count=3,arr[0][1]=0.75*0+0.25*(binomial2(arr,-1,0,p))
 2* count=5,return 0 to count 3
 3* count=3,arr[0][1]=0+0.25*0=0,return 0 to count 2
 * count=2,arr[1][1]=0.75*0+0.25*(binomial2(arr,0,0,p))
 4* count=6 return 1 to count 2
 5* count=2,arr[1][1]=0+0.25*1, return 0.25 to count 1
 * count=1,arr[2][1]=0.75*0.25+0.25*(binomial2(arr,1,0,p))
 * count=7,arr[1][0]=0.75*binomial2(arr,0,0,p)+0.25*binomial2(arr,0,-1,p))
 6* count=8,return 1 to count 7
 * count=7,arr[1][0]=0.75*1+0.25*binomial2(arr,0,-1,p))
 7* count=9,return 0 to count 7
 8* count=7,arr[1][0]=0.75+0.25*0, return 0.75 to count 1
 9* count=1,arr[2][1]=0.75*0.25+0.25*0.75=0.375
 * 
 * 
 * 
 * 3* count=3,arr[0][1]=0
 * 5* count=2,arr[1][1]=0.25
 * 8* count=7,arr[1][0]=0.75
 * 9* count=1,arr[2][1]=0.375
 * 
 * 
 * count=1,arr[3][1]=0.75*binomial2(arr,2,1,p)+0.25*binomial2(arr,2,0,p)
 * count=2,arr[2][1]=0.75*binomial2(arr,1,1,p)+0.25*binomial2(arr,1,0,p)
 * count=3,arr[1][1]=0.75*binomial2(arr,0,1,p)+0.25*binomial2(arr,0,0,p)
 * count=4,arr[0][1]=0.75*binomial2(arr,-1,1,p)+0.25*binomial2(arr,-1,0,p)
 * count=5,return 0 to count 4
 * count=4,arr[0][1]=0.75*0+0.25*binomial2(arr,-1,0,p)
 * count=6,return 0 to count 4
 ** count=4,arr[0][1]=0.75*0+0.25*0=0,return 0 to count 3
 * count=3,arr[1][1]=0.75*0+0.25*binomial2(arr,0,0,p)
 * count=7,return 1 to count 3
 ** count=3,arr[1][1]=0.75*0+0.25*1=0.25, return 0.25 to count 2
 * count=2,arr[2][1]=0.75*0.25+0.25*binomial2(arr,1,0,p)
 * count=8,arr[1][0]=0.75*binomial2(arr,0,0,p)+0.25*binomial2(arr,0,-1,p)
 * count=9,return 1 to count 8
 * count=8,arr[1][0]=0.75*1+0.25*binomial2(arr,0,-1,p)
 * count=10,return 0 to count 8
 ** count=8,arr[1][0]=0.75*1+0.25*0=0.75 return 0.75 to count 2
 ** count=2,arr[2][1]=0.75*0.25+0.25*0.75=0.375 return 0.375 to count 1
 * count=1,arr[3][1]=0.75*0.375+0.25*binomial2(arr,2,0,p)
 * count=11,arr[2][0]=0.75*binomial2(arr,1,0,p)+0.25*binomial2(arr,1,-1,p)
 * count=12,arr[1][0]=0.75,return 0.75 to count 11(cause arr[1][0] not equal -1, so skip two calls)
 //* count=13,return 1 to count 12
 //* count=12,arr[1][0]=0.75*1+0.25*binomial2(arr,0,-1,p)
// * count=14, return 0 to count 12
// * count=12,arr[1][0]=0.75*1+0.25*0=0.75 return 0.75 to count 11
 * count=11,arr[2][0]=0.75*0.75+0.25*binomial2(arr,1,-1,p)
 * count=13,return 0 to count 11
 * count=11,arr[2][0]=0.75*0.75+0.25*0，return 0.5625
 * count=1,arr[3][1]=0.75*0.375+0.25*0.5625
 * 
 * 
 * 
 * 
 * count=4,arr[0][1]=0 
 * count=3,arr[1][1]=0.25
 * count=8,arr[1][0]=0.75
 * count=2,arr[2][1]=0.375
 * count=12,arr[1][0]=0.75*1+0.25*0=0.75
 * 
 * 
 * 
 */


/*	Result:
 *  
1
2
3
4
5
6
7
.
.
.
7745
7746
7747
7748
7749
7750
7751
4.507310875086383E-8

	*/

}