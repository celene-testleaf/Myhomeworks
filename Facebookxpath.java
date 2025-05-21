package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebookxpath {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Celene");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("seles");
        WebElement dd= driver.findElement(By.id("day"));
		Select option = new Select(dd);
		option.selectByValue("5");
		WebElement dd1= driver.findElement(By.id("month"));
		Select option1 = new Select(dd1);
		option1.selectByVisibleText("Nov");
		WebElement dd2= driver.findElement(By.id("year"));
		Select option2 = new Select(dd2);
		option2.selectByVisibleText("2015");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("9677205277");
		driver.findElement(By.id("password_step_input")).sendKeys("AbCd123");
		
	}

}
