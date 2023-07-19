package javafundamentals.cs.loops;

import java.util.Scanner;

public class EvenNumberSeries {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Ending value....");
		int end = ip.nextInt();
		
		for(int i=1;i<=end;i++) {
			if(i%2!=0)
				continue;
			System.out.println(i);
		}

	}

}
