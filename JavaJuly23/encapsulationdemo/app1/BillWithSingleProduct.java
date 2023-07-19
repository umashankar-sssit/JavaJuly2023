package encapsulationdemo.app1;

import java.util.Scanner;

public class BillWithSingleProduct {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		Product  prod = new Product();
		System.out.println("Enter Product Id?");
		prod.setPid(ip.nextInt());
		System.out.println("Enter Product Name:");
		prod.setPname(ip.next());
		System.out.println("Enter Qty:");
		prod.setQty(ip.nextInt());
		System.out.println("Enter MRP");
		prod.setMrp(ip.nextDouble());
		
		prod.displayProduct();

	}

}
