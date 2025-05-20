package week2.day1;

public class ReverseOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String text = "I am a software tester";
     String[] t1 = text.split(text);
     //char[] tt1 = text.toCharArray();
     for(int i=0;i<t1.length;i++) {
    	 if(t1[i]%2!=0) {
    		 System.out.println(t1[i]);
    		 
    	 }
     }
	}

}
