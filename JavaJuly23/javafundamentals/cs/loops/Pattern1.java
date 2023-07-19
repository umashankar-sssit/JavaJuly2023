package javafundamentals.cs.loops;

public class Pattern1 {

	public static void main(String[] args) {
		
		/*
		 * for(int lines=1;lines<=3l;lines++) { for(int i=1;i<=5;i++) {
		 * System.out.printf("%2d%c",i,(i==5)?'.':','); } System.out.println(); }
		 */
		
		for(int lines=1;lines<=3;lines++) {		
		
		for(int i=1;i<=5;i++) {
			System.out.printf("%2d%c",i,(i==5)?'.':',');
			//System.out.println(i);
		}
		System.out.println();
		}
				

	}

}
