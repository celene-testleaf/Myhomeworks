package week3.day2homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfacelargestnumber {

	public static void main(String[] args) {
		int[] num = {3,2,11,4,6,7};
		
		List<Integer> dup = new ArrayList <Integer>();
		for(int i: num) {
			 dup.add(i);
		}
		System.out.println("the list of array is: "+ dup);
		System.out.println(" the 2nd element from the last is: "+dup.get(4));
		Collections.sort(dup);
        System.out.println("Ascending order: "+dup);
        System.out.println("the second largest number: "+(dup.get(dup.size()-2)));
	}

}
