package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HMWebDriver {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		//load url
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("SeleniumTester");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement dd= driver.findElement(By.name("industryEnumId"));
		Select option = new Select(dd);
		option.selectByIndex(2);
		WebElement dd1= driver.findElement(By.name("ownershipEnumId"));
		Select option1 = new Select(dd1);
		option1.selectByVisibleText("S-Corporation");
		WebElement dd2= driver.findElement(By.name("dataSourceId"));
		Select option2 = new Select(dd2);
		option2.selectByValue("LEAD_EMPLOYEE");
		WebElement dd3= driver.findElement(By.name("marketingCampaignId"));
		Select option3 = new Select(dd3);
		option3.selectByIndex(5);
		WebElement dd4= driver.findElement(By.name("generalStateProvinceGeoId"));
		Select option4 = new Select(dd4);
		option4.selectByValue("TX");
		 driver.findElement(By.className("smallSubmit")).click();
		driver.quit();
		
		
	}

}
