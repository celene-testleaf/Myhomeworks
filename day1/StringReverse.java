package week2.day1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name = "Celene";
     String name1 = new String ("Celene");
     System.out.println("The length of the name is "+name.length());
     System.out.println("is name and name1 equal:"+ name.equals(name1));
     System.out.println(name);
     char[] ch = name.toCharArray();
     for(int i=ch.length-1; i>=0;i--) {
    	 
    	 System.out.print(ch[i]);
    		
    	 }
     }
     
	}

