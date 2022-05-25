package org.conditionalstatements;

public class IfElse {
	
	private void drivingLisence(int age) {
		
		if(age>=18) {
			System.out.println("eligible for lisence");
		}
		else {
			System.out.println("not eligible for lisence");
		}

	}
	public static void main(String[] args) {
		IfElse a = new IfElse();
		a.drivingLisence(15);
	}

}
