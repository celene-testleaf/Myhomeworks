package week3.day1homework;

public class LoginTestData extends TestData{
	public void enterusername(String username) {
		System.out.println("The username is: "+username);
	}
	public void enterpassword(String password) {
		System.out.println("The passwrod is: "+ password);
	}

	public static void main(String[] args) {
		LoginTestData LTD = new LoginTestData();
		LTD.enterCredentials("Welcome");
		LTD.navigateToHomePage();
		LTD.enterusername("TestLeaf");
		LTD.enterpassword("test123");

	}

}
