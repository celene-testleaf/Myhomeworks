package week3.day1homework;

public class Button extends WebElement {
     public void submit() {
    	 System.out.println("The text is submitted");
     }
	public static void main(String[] args) {
		Button B = new Button();
		B.click();
		B.setText("Paris");
		B.submit();

	}

}
