package week3.day1homework;

public class WebElement {
	public void click() {
		System.out.println("The button is selected");
	}
	public void setText(String text) {
		System.out.println("the text to enter: "+ text);
	}

	public static void main(String[] args) {
		WebElement WE = new WebElement();
		WE.click();
		WE.setText("France");
		

	}

}
