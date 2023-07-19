package encapsulationdemo.app4;

public class Passenger {
	
	int id;
	String name;
	int seatNumber;
	
	// define setter and getter methods 
	// for each property
	
	public void displayPassenger() {
		System.out.printf
		("%5d%10s%5d\n",id,name,seatNumber);
	}

}
