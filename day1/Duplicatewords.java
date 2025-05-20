package week2.day1;

public class Duplicatewords {

	public static void main(String[] args) {
   // TODO Auto-generated method stub
   String text ="We learn java basics as part of java sessions in java week1";
   int count=0;
   String[] split = text.split(" ");
   for(int i =0; i<split.length;i++) {
	   //System.out.println(split[i]);
	   for(int j=i+1; j<split.length;j++)
	   {
			   if(split[i].equalsIgnoreCase(split[j]))
			   {				   
			      count++;   
			   } 
		  
		   if(count > 1)
		   {
			   System.out.println(text.replace("java", " "));
			  
			   
		   }
	   }
	   
	   
	   
	   
	   count=0;
   }

   
   
	}
	}
