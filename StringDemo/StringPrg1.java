package StringDemo;

import java.util.Scanner;

public class StringPrg1 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter User Name?");
		String userName = ip.next();
		
		System.out.println("Enter password?");
		String password = ip.next();
		
		if("user".equals(userName) && "pass".equals(password))
			System.out.println("Welcome.....");
		else
			System.out.println("Invalid Credentials..");

	}

}
