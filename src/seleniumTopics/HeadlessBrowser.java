package seleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	
	public static void main(String[] args) {
		String Username= "naveenk";
		 String Password ="test@123";
		 
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		// WebDriver 	driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.freecrm.com");
		
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys(Username);
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys(Password);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
	}

}
