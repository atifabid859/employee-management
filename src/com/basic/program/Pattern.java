package com.basic.program;

public class Pattern {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++)
			System.out.println(" ".repeat(n - i) + "* ".repeat(i));
	}
}