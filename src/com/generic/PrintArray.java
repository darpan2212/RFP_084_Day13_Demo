package com.generic;

public class PrintArray<T, E> {

	T value;
	E val;

	public void printArray(E[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}