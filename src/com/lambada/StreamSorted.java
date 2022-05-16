package com.lambada;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Ravindra");
		list.add("Vaibhav");
		list.add("Deshraj");
		list.add("Pavan");
		
		//Stream<String> mysort=list.stream();
		
		//mysort.sorted().
		//forEach(System.out::println);
		//list.stream().forEach(System.out::println);
		list.stream().sorted().forEach(System.out::println);
		//list.forEach(System.out::println);

	}

}
