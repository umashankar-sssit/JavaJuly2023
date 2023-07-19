package javafundamentals.cs.ifdemo;

public class MenuBarDemo {

	public static void main(String[] args) {
		
		String optionName = "abcd";
		
		if(optionName.equals("File")) {
			System.out.println("Selected Menu is File");
		}
		else
			if(optionName.equals("Edit")) {
				System.out.println("Selected Menu is Edit");
			}	
			else
				if(optionName.equals("Search")) {
					System.out.println("Selected Menu is Search");
				}
				else
					System.out.println("Invalid option Name");

	}

}
