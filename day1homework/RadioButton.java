package week3.day1homework;

public class RadioButton extends Button {
	public void selectRadioButton() {
		System.out.println("The Radio button is selected");
	}

	public static void main(String[] args) {
		RadioButton RB = new RadioButton();
		RB.click();
		RB.selectRadioButton();
		RB.setText("Paris");
		RB.submit();
	

	}

}
