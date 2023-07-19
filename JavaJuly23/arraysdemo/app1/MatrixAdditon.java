package arraysdemo.app1;

public class MatrixAdditon {

	public static void main(String[] args) {
		
		int[][] a = {{1,2},{3,4}};
		int b[][] = {{5,6},{7,8}};		
		int[] c[] = new int[2][2];
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				c[row][col] = a[row][col]+b[row][col];				
			}
			
		}
		
		System.out.println("Result is.....");
		for(int[] row : c) {
			for(int value : row) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		

	}

}
