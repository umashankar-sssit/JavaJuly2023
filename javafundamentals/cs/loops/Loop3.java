package javafundamentals.cs.loops;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);		
		int sum = 0;
		int num = 0;		
		do
		 {		
			sum += num;
			
			System.out.println("Enter another number");
			num = ip.nextInt();		
			
		}while(num!=-1);
		
		System.out.println("Sum is..." + sum);		

	}

}
