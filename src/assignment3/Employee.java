package assignment3;


public class Employee {

	private int empno;
	private String ename,email;
	private String mobiles;

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", email="
				+ email + ", mobiles=" + mobiles + ", address=" + address + "]";
	}

	private Address address;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobiles() {
		return mobiles;
	}

	public void setMobiles(String mobiles) {
		this.mobiles = mobiles;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

