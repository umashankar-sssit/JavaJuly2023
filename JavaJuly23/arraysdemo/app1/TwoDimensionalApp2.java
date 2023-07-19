package arraysdemo.app1;

public class TwoDimensionalApp2 {

	public static void main(String[] args) {
		
		int matrix[][] = {{1,2},{3,4},{5,6}};
		
		
		System.out.println("Traditional For Loop");
		for(int row=0;row<matrix.length;row++) {
			for(int col=0;col<matrix[row].length;col++) {
				System.out.print(matrix[row][col] + "\t");
				
			}
			System.out.println();
		}
		
		
		System.out.println("Enhanced For Loop");
		for(int[] row : matrix) {
			for(int value : row) {
				System.out.print(value + "\t");
				
			}
			System.out.println();
		}	

	}

}
