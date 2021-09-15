package org.test;

public class Company extends Employee {
	private void companyName() {
		System.out.println("tcs");

	}	
@Override
public void empDetails(char block) {
	
	super.empDetails(block);
}
@Override
public void empDetails(String name, int id) {
	
	super.empDetails(name, id);
}
@Override
public void empDetails(String name) {
	
	super.empDetails(name);
}

public static void main(String[] args) {
	Company  a = new Company();
	a.companyName();
	a.empDetails('r');
	a.empDetails("ravi");
	a.empDetails("rahul", 1234);

	
}
	
}