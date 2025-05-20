package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		//load url
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
        driver.findElement(By.linkText("Accounts")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("accountName")).sendKeys("SeleniumTester");
        Thread.sleep(2000);
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        Thread.sleep(2000);
        driver.findElement(By.name("numberEmployees")).sendKeys("10");
        Thread.sleep(2000);
        driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.className("smallSubmit")).submit();
        Thread.sleep(2000);
        String heading =driver.getTitle();
		System.out.println(heading);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
