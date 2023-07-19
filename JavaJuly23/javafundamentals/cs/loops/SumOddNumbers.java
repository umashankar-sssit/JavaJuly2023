package javafundamentals.cs.loops;

import java.util.Scanner;

public class SumOddNumbers {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter ending value");
		int end = ip.nextInt();
		int sum=0;
		
		int i=0;
		while(i<=end) {
			i++;
			if(i%2==0)
				continue;
			sum+=i;			
		}
		
		System.out.println("Sum is..." + sum);

	}

}
