package com.basic.program;
public class Pattern1 {
public static void main(String[] args) {
	int a=5;
	 System.out.println("\nPattern #1");
	for(int i=1; i<=a;i++)
		
		System.out.println(" ".repeat(a - i) + "* ".repeat(i));

	
}
}