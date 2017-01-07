/** 
 *  Project Euler Problem 3
 *  Largest prime factor
 *  The prime factors of 13195 are 5, 7, 13 and 29.
 *  What is the largest prime factor of the number 600851475143 ?
 *  Answer: 6857
 */

 
public class Euler3{
	
	public static void main (String[] args){
		
		long num = 600851475143L;
		long largest=1;
		
		
		for(long i = 2; i<(num/i); i++){
			if((num % i)==0){
				if(isPrime(i)){
					largest=i;
				}
			}
		}
		System.out.println("The largest prime factor of " + num + " is " + largest + ".");

	}
	
	public static boolean isPrime(long num){
		//not prime if even & over 2
		if((num%2)==0 && num >2)
			return false;
		
		//only check odd numbers up to sq rt
		for(long a=3;a*a<num;a+=2){
			if((num%a)==0)
				return false;
		}
		
		return true;
	}
}