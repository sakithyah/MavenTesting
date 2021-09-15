package org.test;

public class Axis extends Indian{
	public void savings() {
	System.out.println("%5");
	}
	public void fixed() {
	System.out.println("%6");	
}
	@Override
	public void saving() {
	System.out.println("%4");	
	}
	@Override
	public void deposite() {
		System.out.println("%9");
	}
	public static void main(String[] args) {
		Axis a =new Axis();
		a.savings();
		a.saving();
		a.deposite();
		a.fixed();
		a.intrest();
	}
	
}