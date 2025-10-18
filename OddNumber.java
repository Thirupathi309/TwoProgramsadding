package com.git;

import java.util.Arrays;
import java.util.List;

public class OddNumber {
	public static void main(String[] args) {
		
		List<Integer>numbers=Arrays.asList(33,22,55,44,77,88,50);
		numbers.stream().filter(i->i%2!=0).forEach(n->System.out.println(n));
	}
}
