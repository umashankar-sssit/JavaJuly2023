package StringDemo;

public class StringPrg3 {

	public static void main(String[] args) {
		
		String firstName = "first";
		String lastName = "last";
		
		System.out.println("Full Name = " + 
		                      firstName.concat(lastName) + 
		                      "-->" +
		                firstName.concat(" ").concat(lastName));
		System.out.println("Length of First Name is:" + 
		                firstName.length());
		
		String fullName = "first,last";
		
		System.out.println(fullName.substring(3));
		System.out.println(fullName.substring(3,6));
		
		String newname = fullName.concat("Hi");
		System.out.println(fullName);
		System.out.println(newname);
		
		
		
		
		
		

	}

}
