package com.maxnumber;

public class MaximumNumber {

	public int findMaxNumber(int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		}
		if (y > x && y > z) {
			return y;
		}
		if (z > y && z > x) {
			return z;
		}
		return 0;
	}

	public static void main(String[] args) {
		int intX = 45, intY = 51, intZ = 97;
		
		MaximumNumber maxInt = new MaximumNumber();
		System.out.println(maxInt.findMaxNumber(intX, intY, intZ));
	}

}