package org.conditionalstatements;

public class LogicalOperator {
	private void policeSelection(int age,int weight,int height) {
		if((age>=18 && weight>=50) || (age>=18 && height>=170)) {
			System.out.println("eligible for selection");
		}
		else {
			System.out.println("not eligible for selection");
		}

	}
	public static void main(String[] args) {
		LogicalOperator a = new LogicalOperator();
		a.policeSelection(15, 55, 60);
	}

}
