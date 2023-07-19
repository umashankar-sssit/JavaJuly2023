package encapsulationdemo.app5;

public class Matrix {
	
	int mat[][] = new int[2][2];
	
	public void saveElements(int temp[][]) {
		mat=temp;		
	}
	
	public Matrix addMatrix(Matrix p) {
		Matrix temp = new Matrix();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				temp.mat[i][j]=mat[i][j]
						+p.mat[i][j];
			}
		return temp;
	}
	
	public void displayMatrix() {
		System.out.println("Elements are...");
		for(int[] t : mat) {
			System.out.println();
			for(int v : t)
				System.out.printf("%4d",v);
		}
	}
	
	public boolean checkIdentity() {
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) 
				if(i==j && mat[i][j]!=1) 
					return false;
					else
						if(i!=j && mat[i][j]!=0)
							return false;
			
					
				
			}		
		return true;		
	}

}
