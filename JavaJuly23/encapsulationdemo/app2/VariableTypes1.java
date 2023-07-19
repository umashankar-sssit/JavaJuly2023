package encapsulationdemo.app2;

public class VariableTypes1 {
	
	static String courseName="Java";
	String rollNumber = "J101"; 
	
	public static void main(String[] args) {
		/* Accessing the static variable
		 * using class Name
		 */
		System.out.println
		       (VariableTypes1.courseName);
		
		/* Not allowed
		* System.out.println 
		* (VariableTypes1.rollNumber);
		*/
		
		/* Try to access both the variables
		 * using object reference
		 */
		VariableTypes1 vt = new VariableTypes1();
		System.out.println(vt.rollNumber);
		System.out.println(vt.courseName);
	}
}
