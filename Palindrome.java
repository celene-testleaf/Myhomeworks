package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int inputNum = 12321, outputNum = 0;
    
    for(int Num=inputNum; Num>0; Num/=10) {
    	int remainder=Num%10;
    	outputNum=outputNum*10+remainder;
    }

    if (inputNum==outputNum) 
    	System.out.println(inputNum + " is palindrome");
    
   else
    		System.out.println(inputNum + " is NOT a palindrome");	 	 
     }
}

