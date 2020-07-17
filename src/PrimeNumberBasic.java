package MathProblems;

// Find all prime numbers between 2 to 1000

import java.util.ArrayList;

public class PrimeNumber {

// Define your input type as int

	public static void main(String[] args) {
		ArrayList<Integer> primeList = new ArrayList<>();
		int max = 1000;
    
//A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers. 
//A natural number greater than 1 that is not prime is called a composite number.    
//Logic : use mod funciton and check on the reminder  

		for (int x=2; x<max; x++) {
			boolean isPrime = true;
			for (int y=2; y<x; y++)
			if (x % y == 0) {
				isPrime = false;
			}
		if (isPrime)
			primeList.add(x);
		}
		System.out.println(primeList);
	}
}

// This will work up to 1000. For bigger number you have to change the data type or refactor with a different logic 
