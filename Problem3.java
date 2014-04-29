/**
 * Largest Prime Factor
 * https://projecteuler.net/problem=3
 * @author Ranbir Aulakh
 *
 */
public class Problem3 {
	
	/*
	 * prime factos of 13195 are 5, 7, 13, 29
	 * what is the largest prime factor of 600851475143
	 * 
	 *  pseudo code:
	 *  	long = 600L
	 *  	do a for loop (i = 2, i * i < num, ++)
	 *  		determine a prime number
	 *  			then print out
	 *  	
	 *  	boolean isPrime
	 *  		determine a prime number
	 *  			do a for loop and return false/true
	 *  
	 */
	
	public static void main(String[] args){
		long num = 600851475143L;
		for(long i = 2; i * i < num; i++){
			if(isPrime(i) == true){
				if(num % i == 0)
					System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(long n){
	    for(int i = 2; i < n;i++)
	        if(n % i == 0)
	            return false;
	    return true;
	}
}
