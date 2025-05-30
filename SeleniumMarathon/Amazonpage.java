package SeleniumMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazonpage {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("sac-suggestion-row-1")).click();
        String text = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
        System.out.println(text);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Brands']/following::span[text()='Safari']")).click();
        driver.findElement(By.xpath("//span[text()='Brands']/following::span[text()='Gear']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
        driver.findElement(By.id("s-result-sort-select_4")).click();
        //get 1st product details
        String firstproduct = driver.findElement(By.xpath("//span[contains(text(),'Verge 37L')]")).getText();
        System.out.println(firstproduct);
        //product price
        String productprice = driver.findElement(By.xpath("//span[text()='1,199']")).getText();
        System.out.println(productprice);
        //get title
        String title=driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
	}

}
