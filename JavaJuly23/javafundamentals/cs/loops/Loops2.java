package javafundamentals.cs.loops;

import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) {		
		Scanner ip = new Scanner(System.in);		
		int sum = 0;		
		
		System.out.println("Enter a number");
		int num = ip.nextInt();		
		
		while(num!=-1) {
			sum += num;
			
			System.out.println("Enter another number");
			num = ip.nextInt();
		}
		
		System.out.println("Sum is..." + sum);
	}

}
