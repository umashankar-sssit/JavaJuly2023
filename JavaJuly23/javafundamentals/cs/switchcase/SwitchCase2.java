package javafundamentals.cs.switchcase;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		char operator = '+';
		
		if(operator=='+')
			System.out.println("Addition");
		else
			if(operator=='-')
				System.out.println("Subtraction");
			else
				if(operator=='*')
					System.out.println("Multiplication");
				else
					System.out.println("Invalid character");
		
		switch(operator) {
		case '+':
			System.out.println("Addition");
			break;
		case '-':
			System.out.println("Subtraction");
			break;
		case '*':
			System.out.println("Multiplication");
			break;
		default:
			System.out.println("Invalid character");
		}

	}

}
