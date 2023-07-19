package encapsulationdemo.app3;

public class Calculator {
	
	int addition(int p,int q) {
		System.out.println("Adding two numbers");
		return p+q;
	}
	
	int subtraction(int p,int q) {
		System.out.println("subtraction of two numbers");
		return p-q;
	}
	
	int multiplication(int p,int q) {
		System.out.println("Mutiplication of two numbers");
		return p*q;		
	}
	
	void displayNumber(int p) {
		System.out.println("Entered value is:" + p);
	}

}
