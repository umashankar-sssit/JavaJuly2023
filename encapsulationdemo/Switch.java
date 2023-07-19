package encapsulationdemo;

public class Switch {
	
	String state ="Off";
	String name;	
	public void setLabel(String nm) {
		name=nm;		
	}	
	public void press() {
		
		if("off".equalsIgnoreCase(state)) 
			state="On";
		else
			state = "Off";		
		System.out.println
		("State of " + name +" Switch is: " + state);
	}
	
	public void currentState() {
		System.out.println
		("Current State of " + name +" Switch is: " + state);
	}

}
