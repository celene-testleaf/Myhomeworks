package week3.day1homework;

public class TestData {
	public void enterCredentials(String message) {
		System.out.println(message);
	}
    public void navigateToHomePage() {
    	System.out.println("The page is navigated");
    }
	public static void main(String[] args) {
		TestData TD = new TestData();
		TD.enterCredentials("Welcome");
		TD.navigateToHomePage();
		

	}

}
