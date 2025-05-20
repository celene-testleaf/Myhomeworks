package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String text1= "potss", text2="Stops";
       if(text1.length()==text2.length()) {
    	   System.out.println("Length is matching");
       char[] t1 = text1.toCharArray();
       char[] t2 = text2.toCharArray();
       Arrays.sort(t1);
       System.out.println(t1);
       Arrays.sort(t2);
       System.out.println(t2);
       
       if(Arrays.equals(t1, t2)) {
    	   System.out.println("The give strings are Anagram");
       }
       else {
    	   System.out.println("The given strings are not Anagram");
       }
       
       }
      
    	   else {
    		   System.out.println("length mismatch");
    	   }
    	   }
	}
