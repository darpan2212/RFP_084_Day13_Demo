package com.generic;

public class GenericDemo {

	public static void main(String[] args) {
		PrintArray printArray = new PrintArray();
		
		Integer[] intArr = {10,20,30,40};
		printArray.printArray(intArr);

		Double[] dArr = {10.5643,20.234,30.0,40.98765};
		printArray.printArray(dArr);
	}
	
}