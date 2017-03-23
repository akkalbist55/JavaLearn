package com.swastik.array;

public class TestArray{
	public static void main(String[] args){
		String[] employees = {"Raju", "Rachana", "Rashika", "Rashik"};

		System.out.println("Total Employees: " + employees.length);

		for(int i = 0; i < employees.length; i++){
			System.out.println(i + ". " + employees[i]);
		}

		// Array through foreach
		double[] marks = {70, 60, 75, 90, 45};
		for (double mark: marks) {
			System.out.println(mark);
      	}

      	int[] anything = new int[3]; // empty array
      	anything[0] = 1;
      	System.out.println(anything.length);
	}
}