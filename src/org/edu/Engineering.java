package org.edu;

public class Engineering extends Medicine {
	public void btech() {
		System.out.println("btech is  engineering ");
	}
	public void BE () {
System.out.println("BE is bachelor of  technology ");
	}
	public static void main(String[] args) {
		Engineering run = new Engineering();
		run.BE();
		run.btech();
		run.dental();
		run.physiyo();
	}

}
