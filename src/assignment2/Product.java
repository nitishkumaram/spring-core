package assignment2;

public class Product implements Comparable<Product>{

	
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price="
				+ price + "]";
	}
	private int pno;
	private String pname;
	private double price;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno =pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String ename) {
		this.pname = ename;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Product p) {
		if(this==p)
			return 0;							 //Custom comparison logic based on employee number
		else if(this.pno>p.pno)
			return 1;
		else
			return -1;
	}
	
	
}
