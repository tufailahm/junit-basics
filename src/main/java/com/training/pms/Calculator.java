package com.training.pms;

public class Calculator {
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int div(int num1, int num2) {
		return num1 / num2;
	}

	public boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
