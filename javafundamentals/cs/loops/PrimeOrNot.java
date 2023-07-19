package javafundamentals.cs.loops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {		
		Scanner ip = new Scanner(System.in);		
		System.out.println("enter any number");
		int num = ip.nextInt();		
		boolean isPrime = true;
		int dr = 2;		
		while(dr<=num/2) {
			if(num%dr==0)
			{
				isPrime=false;
				break;
			}
			dr++;
		}		
		if(isPrime)
			System.out.println(num + " is Prime number");
		else
			System.out.println(num + "is not prime number");

	}

}
