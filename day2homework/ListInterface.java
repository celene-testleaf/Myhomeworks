package week3.day2homework;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {3,2,11,4,6,7};
		int[] num2 = {1,2,8,4,9,7};
		
		List<Integer> dupone = new ArrayList <Integer>();
		List<Integer> duptwo = new ArrayList <Integer>();
		 
		//for each loop 
		 for(int i: num1) {
			 dupone.add(i);
		 }
		 for(int j: num2) {
			 duptwo.add(j);
		 }
		 System.out.println(dupone);
		 System.out.println(duptwo);
		 
		 for(int i=0; i<dupone.size(); i++) {
		for(int j=0; j<duptwo.size();j++) {
			 if(dupone.get(i)==duptwo.get(j)) {
				System.out.println("the same values are:" + duptwo.get(j));
			 }
					 
	}
}}}