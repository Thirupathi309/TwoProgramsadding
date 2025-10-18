package com.git;

import java.util.Arrays;
import java.util.List;

public class NamesPrint {
	public static void main(String[] args) {
		List<String>names=Arrays.asList("Apple","Cherry","Banana","Graphs");
		names.stream().forEach(n->System.out.println(n));
	}

}
