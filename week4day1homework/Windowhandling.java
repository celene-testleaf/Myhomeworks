package week4day1homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		opt.addArguments("--disable-notification");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='sectionHeaderTitle_contacts']/following::img)[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		//switch to child window 
		Set <String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		//converting set to list 
		List <String> getwindow = new ArrayList<String>(allwindow);
		driver.switchTo().window(getwindow.get(1));
		driver.manage().window().maximize();
		String Child = driver.getTitle();
		System.out.println(Child);
		//child 1 first contact 
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		Thread.sleep(5000);
		//switch back to parent
		driver.switchTo().window(getwindow.get(0));
		driver.findElement(By.xpath("(//div[@id='sectionHeaderTitle_contacts']/following::img)[2]")).click();
		Thread.sleep(5000);
		//child 2 second contact 
		Set <String> allwindow1 = driver.getWindowHandles();
		System.out.println(allwindow1);
		List <String> getwindow1 = new ArrayList<String>(allwindow1);
		Thread.sleep(5000);
		driver.switchTo().window(getwindow1.get(1));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String Child1 = driver.getTitle();
		System.out.println(Child1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		Thread.sleep(5000);
		//switch back to parent
		driver.switchTo().window(getwindow.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String last = driver.getTitle();
		System.out.println(last);
		driver.quit();
		
		

	}

}
