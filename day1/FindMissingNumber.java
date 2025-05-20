package week2.day1;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num[]= {1, 4,3,2,8, 6, 7};
     Arrays.sort(num);

     for(int i=0; i<num.length;i++) {
    	 //System.out.println(i);
    	 if(num[i]!=i+1) {
    		 System.out.println("The missing number is:" + (i+1));
    		 break;
    	 }
     }
	}

}
