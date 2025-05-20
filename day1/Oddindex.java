package week2.day1;

public class Oddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String text ="changeme";
     char[] t1 = text.toCharArray();
     for(int i=0; i<t1.length;i++) {
    	 if(i%2!=0) {
    		 t1[i]=Character.toUpperCase(t1[i]);
    	 }
     }
     System.out.println(t1);
     
	}

}
