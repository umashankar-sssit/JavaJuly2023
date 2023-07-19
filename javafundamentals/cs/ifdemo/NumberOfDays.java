package javafundamentals.cs.ifdemo;

public class NumberOfDays {

	public static void main(String[] args) {
		
		int numDays=365;
		
		int year = 2012;
		
		if(year%4==0)
			numDays++;
		
		System.out.println
		("Number of Days in " + year + " is:" + numDays);

	}

}
