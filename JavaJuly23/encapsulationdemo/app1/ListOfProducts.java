package encapsulationdemo.app1;

import java.util.Scanner;

public class ListOfProducts {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		/* Create an Array of type Products */
		//int array[] = new int[5];
		Product prodList[] = new Product[3];
		
		for(int i=0;i<prodList.length;i++) {
		Product  prod = new Product();
		System.out.println("Enter Product Id?");
		prod.setPid(ip.nextInt());
		System.out.println("Enter Product Name:");
		prod.setPname(ip.next());
		System.out.println("Enter Qty:");
		prod.setQty(ip.nextInt());
		System.out.println("Enter MRP");
		prod.setMrp(ip.nextDouble());
		
		prodList[i] = prod;
		}
		
		int totalBill =0;
		System.out.println("List of Products.....");
		for(int i=0;i<prodList.length;i++) {
			prodList[i].displayProduct();
			totalBill +=prodList[i].getItemPrice();
		}
		
		System.out.println("Total Bill is..." + totalBill);
		

	}

}
