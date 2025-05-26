package week3.day1homework;

public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("The checkbox is selected");
	}

	public static void main(String[] args) {
		CheckBoxButton CBB = new CheckBoxButton();
		CBB.clickCheckButton();
		CBB.setText("USA");
		CBB.click();
		CBB.submit();

	}

}
