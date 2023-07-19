package javafundamentals.cs.switchcase;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		int value=2;
		
		if(value==1)
			System.out.println("One");
		else
			if(value==2)
				System.out.println("Two");
			else
				if(value==3)
					System.out.println("Three");
				else
					if(value==4)
						System.out.println("Four");
					else
						System.out.println("Invalid Input");
		
			
		switch(value) {
		
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Invalid Input");
			
		}

	}

}
