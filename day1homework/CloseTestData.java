package week3.day1homework;

public class CloseTestData extends TestData{
	protected void Closepage() {
		System.out.println("The page is closed");
	}

	public static void main(String[] args) {
		CloseTestData CTD= new CloseTestData();
		CTD.enterCredentials("Welcome");
		CTD.navigateToHomePage();
		CTD.Closepage();

	}

}
