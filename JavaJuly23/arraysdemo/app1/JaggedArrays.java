package arraysdemo.app1;

import java.util.Scanner;

public class JaggedArrays {

	public static void main(String[] args) {
		
		int jarray[][] = new int[4][];
		jarray[0]= new int[1];
		jarray[1]= new int[2];
		jarray[2]= new int[4];
		jarray[3]= new int[3];
		
		Scanner ip = new Scanner(System.in);
		
		for(int row=0;row<jarray.length;row++) {
			System.out.println("Enter the Element to  " + row + " row");
			for(int col=0;col<jarray[row].length;col++) {
				System.out.println("Enter Element?");
				jarray[row][col] = ip.nextInt();
			}
			
		}
		
		System.out.println("Result....");
		for(int row[] : jarray) {
			for(int value : row)
				System.out.print(value + "\t");
			System.out.println();
		}
		
		
		

	}

}
