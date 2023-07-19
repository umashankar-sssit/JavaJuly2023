package arraysdemo.app1;

import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter the size of data?");
		int size = ip.nextInt();
		
		String[] studentNames = new String[size];
		
		/* accept the student names 
		 * Traditional For loop */
		for(int i=0;i<size;i++) {
			System.out.println("Enter Student Name?");
			studentNames[i] = ip.next();
		}
		
		/* display the student names 
		 * Traditional For loop 
		 * */
		
		System.out.println("Using Traditional For Loop");
		for(int i=0;i<size;i++) {
			System.out.println(studentNames[i]);
		}
		
		/* display the student names
		 * using Enhanced for loop
		 */
		
		System.out.println("Using Enhanced For Loop");
		for(String name : studentNames) {
			System.out.println(name);
		}
		
		
		

	}

}
