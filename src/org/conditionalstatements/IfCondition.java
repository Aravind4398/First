package org.conditionalstatements;

public class IfCondition {

	private void voterEligibility(int age) {
	
		if(age>=18) {
			System.out.println("eligible to vote");
		}

	}
	public static void main(String[] args) {
		IfCondition a = new IfCondition();
		a.voterEligibility(19);
	}
}
