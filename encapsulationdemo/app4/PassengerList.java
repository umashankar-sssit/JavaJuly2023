package encapsulationdemo.app4;

public class PassengerList {
	
	Passenger list[] = new Passenger[6];
	int numPassengers=0;
	
	public void insertPassengerInfo(String nm) {
		Passenger passenger = new Passenger();
		passenger.id=100+numPassengers;
		passenger.name=nm;
		passenger.seatNumber=numPassengers+1;
		list[numPassengers]=passenger;
		numPassengers++;
	}
	
	public void displayPassengerList() {
		/*
		 * for(Passenger p : list) { p.displayPassenger(); }
		 */
		for(int i=0;i<numPassengers;i++) {
			list[i].displayPassenger();
		}
	}
	
	// display number of passengers	

}
