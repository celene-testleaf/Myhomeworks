package week3.day1homework;

public class Elements extends Button{
	public void close() {
		System.out.println("All tabs are closed");
	}

	public static void main(String[] args) {
		Elements E = new Elements();
		RadioButton Rb = new RadioButton();
		CheckBoxButton Cbb = new CheckBoxButton();
		TextField Tf = new TextField();
		E.click();
		Tf.getText();
		Rb.selectRadioButton();
		Cbb.clickCheckButton();
		E.setText("Chennai");
		E.submit();
		E.close();


	}

}
