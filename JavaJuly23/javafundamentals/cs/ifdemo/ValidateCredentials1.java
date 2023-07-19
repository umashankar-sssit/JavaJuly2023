package javafundamentals.cs.ifdemo;

public class ValidateCredentials1 {
	
	public static void main(String[] args) {
		
		String userName = "user1";
		String password = "pass";
		
		if(userName.equals("user")) {
			if(password.equals("pass"))
				System.out.println("Welcome to MyPage");
			else
				System.out.println("Invalid Password");
		}
			
		else
			System.out.println("Invalid User Name");
	}

}
