package arraysdemo.app1;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		int nums[] = {10,2,13,4,45};
		int searchElement = 4;
		
		boolean isFound = false;
		for(int num : nums) {
			if(num==searchElement)
			{
				isFound=true;
				break;				
			}
		}
		
		if(isFound)
			System.out.println("found");
		else
			System.out.println("Not Found");	
		

	}

}
