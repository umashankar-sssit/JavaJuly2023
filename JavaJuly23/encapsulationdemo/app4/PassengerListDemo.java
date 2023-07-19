package encapsulationdemo.app4;

import java.util.Scanner;

public class PassengerListDemo {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		PassengerList bus4598 = 
				new PassengerList();
		
		char option='n';
		do
		{
			System.out.println("Enter Name:");
			String name = ip.next();
			bus4598.insertPassengerInfo(name);
			
			System.out.println
			("Do you want continue....?");
			option = ip.next().charAt(0);
		}while(option!='n');
		
		System.out.println("Passenger List...");
		bus4598.displayPassengerList();
			
			
		

	}

}
