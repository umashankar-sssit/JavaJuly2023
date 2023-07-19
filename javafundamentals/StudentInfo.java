package javafundamentals;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Htno?");
		//int htno = ip.nextInt();
		String htno = ip.next();
		
		System.out.println("Enter Name?");
		String name = ip.next();
		
		System.out.println("Enter Course?");
		String course = ip.next();
		
		System.out.println("Enter Fees?");
		double fees = ip.nextDouble();
		
		System.out.println("Htno.." + htno);
		System.out.println("Name..." + name);
		System.out.println("Course..." + course);
		System.out.println("Fees..." + fees);

	}

}
