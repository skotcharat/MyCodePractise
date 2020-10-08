package javaproject;
/**
 * 
 * @author student
 * Greatest Common Divisor
The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder.
Write a method that returns the Greatest Common Divisor of p and q.
 */

public class GreatestCommonDivisor {
	
	
	public static void main(String[] args) {
		System.out.println(gcd(55, 5));	
	}
	
	public static Integer gcd(Integer p, Integer q) {
		
		int divide = 0;
		if(p > q) {
			divide = (p %
					q);
		}
		return divide;
		
	}
		
	
		
		
		
		
		
}

