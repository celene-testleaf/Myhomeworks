package week2.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //int[] value= {2,5,7,7,5,9,2,3};
    // for (int i=0; i<value.length;i++) 
     //{
    	 
    	 // for(int j=i+1; j<value.length; j++) 
    	  //{
    		  
    	 //if(value[i]==value[j])
    	// {
    	
    	// System.out.println("The duplicate value is : " + value[j]);
    	 
    


int[] num = {23,34,35,23,34,56};
   Arrays.sort(num);
   for(int i=0; i<num.length-1; i++) {
	   if(num[i]==num[i+1]) {
		   System.out.println("Duplicate values: "+ num[i+1]);
	   }
   }
   }
   }
   

