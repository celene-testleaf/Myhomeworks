package week1.day2;

public class Library {

	public String AddBook (String Bookname) {
		   System.out.println("Book added successfully");
		 return "Booktitle: " + Bookname;
	 }
    	public void issuebook() {
    		System.out.println("Book issued successfully");
    	}
    	public static void main(String[] args) {
    		Library L = new Library();
    		String AB = L.AddBook("Chase the moon");
    		System.out.println(AB);
    		L.issuebook();
    		
    		
	   
   }
	}

