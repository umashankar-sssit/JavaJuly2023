package encapsulationdemo.app1;

public class Product {
	
	int pid;
	String pname;
	int qty;
	double mrp;
	
	public void setPid(int id) {
		pid=id;
	}	

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	
	public void displayProduct() {
		System.out.printf("%5d%10s%5d%6.2f\n",pid,pname,qty,mrp);
	}
	
	public double getItemPrice() {
		return mrp*qty;
	}

}
