// date:17.3.24
// author: linyang <linyang@xiaomi.com>
// 重写程序清单4-11

import java.util.Scanner;


public class P6_6 {
	public static void main(String args[]) {
		final int NUM_OF_PRIMES = 50;
		int[] primeNumbers = new int[NUM_OF_PRIMES];
		int count = 0;
		int number = 2;
		
		while(count < NUM_OF_PRIMES) {
			boolean isPrime = true;
			for (int i = 0; i < count && primeNumbers[i] <= Math.sqrt(number); i++) {
				if (number % primeNumbers[i] == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primeNumbers[count] = number;
				count++;
			}
			
			number++;
			
		}
		
		for (int i = 0; i < 50; i++) {
			System.out.print(primeNumbers[i] + " ");
		}
		System.out.println("");
	}
}
		
		