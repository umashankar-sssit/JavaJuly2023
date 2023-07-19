package javafundamentals;

public class Datatypes1 {

	public static void main(String[] args) {
		
		byte b = 10;
		byte c = 20;
		
		//byte d = b+c;
		
		// Solution - 1 : Explicit type casting
		byte d = (byte)(b+c);
		
		// Solution - 2 : declare the result as int
		int e = b+c;
		
		System.out.println(d);
		System.out.println(e);

	}

}
