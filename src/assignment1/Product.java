package assignment1;

public class Product {

	
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
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
