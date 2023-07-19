package javafundamentals.cs.loops;

public class LoopsDemo1 {

	public static void main(String[] args) {
		
		/* Using While Loop */
		System.out.println("Using While Loop");
		int i=1;
		while(i<=5) {
			System.out.println("Hi");
			i++;
		}
		
		/* Using For loop */
		System.out.println("Using For loop");
		for(int j=1;j<=5;j++) {
			System.out.println("Hi");
		}
		
		
		/* Using do..while loop */
		System.out.println("Using Do..While");
		int k=1;
		do
		{
			System.out.println("Hi");
			k++;
		}while(k<=5);
		

	}

}
