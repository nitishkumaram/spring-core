package com.employee.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Employee {

	private int empno;
	private String ename,email;
	private String mobiles[];
	private Map<Integer,String> qualification;
	private List<String> familyMembers;
	
	public Employee(Address address) {
		this.address=address;
	}
	public Map<Integer, String> getQualification() {
		return qualification;
	}
	public void setQualification(Map<Integer, String> qualification) {
		this.qualification = qualification;
	}
	public List<String> getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(List<String> familyMembers) {
		this.familyMembers = familyMembers;
	}
	public String[] getMobiles() {
		return mobiles;
	}
	public void setMobiles(String[] mobiles) {
		this.mobiles = mobiles;
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
	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", email="
				+ email + ",\n mobiles=" + Arrays.toString(mobiles)
				+ ", qualification=" + qualification + ",\n familyMembers="
				+ familyMembers + ", address=" + address + "]";
	}
	
	
	
}
