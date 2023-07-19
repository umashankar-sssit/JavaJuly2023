package arraysdemo.app1;

import java.util.Scanner;

public class TwoDimensionalApp1 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		int matrix[][] = new int[3][2];
		
		System.out.println("Enter 3X2 Matrix:");
		
		for(int row=0;row<matrix.length;row++) {
			for(int col=0;col<matrix[row].length;col++) {
				System.out.println("Element?");
				matrix[row][col] = ip.nextInt();
			}
		}
		
		
		System.out.println("Elements in matrix are as follows:");
		for(int row=0;row<matrix.length;row++) {
			for(int col=0;col<matrix[row].length;col++) {
				System.out.print(matrix[row][col] + "\t");
				
			}
			System.out.println();
		}

	}

}
