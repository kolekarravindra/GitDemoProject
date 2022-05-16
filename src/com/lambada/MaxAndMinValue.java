package com.lambada;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxAndMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream instream = IntStream.rangeClosed(1, 100);
		OptionalInt optional = instream.max();
		Integer max =optional.getAsInt();
		System.out.println("max value:"+max);
		
		instream = IntStream.rangeClosed(1, 100);
        System.out.println("min value:"+instream.min().getAsInt());
        
        instream = IntStream.rangeClosed(1, 100);
        System.out.println("Average value:"+instream.average().getAsDouble());
	}

}
