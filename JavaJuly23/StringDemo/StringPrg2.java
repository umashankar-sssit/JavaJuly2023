package StringDemo;

public class StringPrg2 {

	public static void main(String[] args) {
		
		String str1 = "A";
		String str2 = "D";
		String str3 = "K";
		
		if(str1.compareTo(str2)>0 && str1.compareTo(str3)>0)
			System.out.println("Str1 = " + str1);
		else
			if(str2.compareTo(str3)>0)
				System.out.println("Str2 = " + str2);
			else
				System.out.println("Str3 = " + str3);
		
			

	}

}
