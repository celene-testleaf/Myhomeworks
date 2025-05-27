package week3.day2homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> Value = new ArrayList <Integer>();
		for(int i: num) {
			 Value.add(i);
		}
		Collections.sort(Value);
		System.out.println("The sorted array is: "+Value);
		
		for(int i=1; i<Value.get(Value.size()-1);i++) {
	    	 if(!Value.contains(i)) {
	    		 System.out.println("The missing number is:" +i);
	    	 }
		
	}
}}
		