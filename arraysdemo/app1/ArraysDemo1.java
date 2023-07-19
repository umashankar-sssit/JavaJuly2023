package arraysdemo.app1;

import java.util.Scanner;

public class ArraysDemo1 {

	public static void main(String[] args) {		
		Scanner ip = new Scanner(System.in);		
		
		// Step 1:
		String courseList[];
		
		// Step 2:
		System.out.println("Enter the size of array:");
		int size = ip.nextInt();
		
		courseList = new String[size];
		
		System.out.println("Enter the List of Courses?");
		
		/* reading the list of courses */
		for(int i=0;i<size;i++) {
			System.out.println("Enter Course?");
			courseList[i]= ip.next();
		}
		
		/* Display the list of courses */
		for(int i=0;i<size;i++) {
			System.out.println(courseList[i]);			
		}
	}

}
