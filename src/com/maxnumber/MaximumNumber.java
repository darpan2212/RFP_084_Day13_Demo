package com.maxnumber;

public class MaximumNumber {

	public double findMaxNumber(double x, double y, double z) {
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
		double doubleX = 45, doubleY = 51, doubleZ = 97;
		
		MaximumNumber maxInt = new MaximumNumber();
		System.out.println(maxInt.findMaxNumber(doubleX, doubleY, doubleZ));
	}

}