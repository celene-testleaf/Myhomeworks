package week3.day1homework;

public class TextField extends WebElement{
	public void getText() {
		System.out.println("The text is fetched");
	}

	public static void main(String[] args) {
		TextField TF = new TextField();
		TF.click();
		TF.setText("UK");
		TF.getText();

	}

}
