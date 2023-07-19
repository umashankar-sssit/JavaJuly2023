package javafundamentals.cs.switchcase;

import java.util.Scanner;

public class SwitchCaseDemo3 {
	public static void main(String[] args) {		
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Option:");
		String option = ip.next();
		
		switch(option) {
		case "File":
			System.out.println("Selected Menu is File");
			break;
		case "Edit":
			System.out.println("Selected Menu is Edit");
			break;
		case "Search":
			System.out.println("Selected Menu is Search");
			//break;
		default:
			System.out.println("Invalid option");
			
		}

	}

}
