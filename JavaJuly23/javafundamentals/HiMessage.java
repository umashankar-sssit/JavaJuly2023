package javafundamentals;

import java.util.Scanner;

public class HiMessage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter User Name:");
		String userName = input.next();
		
		System.out.println("Hello...." + userName);

	}

}
