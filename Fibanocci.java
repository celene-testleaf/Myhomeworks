package week1.day2;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int Fibo=8, a=0,b=1;
      System.out.println("The fibonacci number is");
     for(int i=1; i<=Fibo;++i) {
    	  System.out.println(a +",");
    	  int nextnum= a+b;
    	  a=b;
    	  b=nextnum;
      }
      
	}

}
