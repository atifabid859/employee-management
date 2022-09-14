package com.variable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(1,32,45,76,89);
	 List<Integer> list2=  list.stream().filter(a->a>10).collect(Collectors.toList());
	System.out.println(list2);
	}
}
