package javafundamentals.cs.ifdemo;

public class ValidateCredentials {
	
	public static void main(String[] args) {
		
		String userName = "user1";
		String password = "pass";
		
		if(userName.equals("user") && 
				password.equals("pass"))
			System.out.println("Welcome to MyPage");
		else
			System.out.println("Invalid credentials");
	}

}
