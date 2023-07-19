package encapsulationdemo.app5;

public class MatrixDemo {
	
	public static void displayIdentity(Boolean b) {
		
		if(b)
			System.out.println("Identity matrix");
		else
			System.out.println("Not an Identity matrix");
			
		
	}

	public static void main(String[] args) {
		
		int[][] mat1 = {{1,2},{3,4}};
		int[][] mat2 = {{5,6},{7,8}};
		
		Matrix m1 = new Matrix();
		m1.saveElements(mat1);
		
		Matrix m2 = new Matrix();
		m2.saveElements(mat2);
		
		Matrix m3 = m1.addMatrix(m2);
		
		m1.displayMatrix();
		m2.displayMatrix();
		m3.displayMatrix();
		
		Matrix identity = new Matrix();
		identity.saveElements
		(new int[][] {{1,0,0},{0,1,0},{0,0,1}});
		displayIdentity(identity.checkIdentity());
		
		identity.displayMatrix();
		
		Matrix identity1 = new Matrix();
		identity1.saveElements
		(new int[][] {{1,1,0},{0,1,0},{0,0,1}});
		
		
		identity1.displayMatrix();
		

	}

}
