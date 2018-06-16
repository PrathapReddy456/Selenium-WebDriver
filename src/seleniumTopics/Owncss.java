package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Owncss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.bankofamerica.com/");
		
		driver.findElement(By.cssSelector("input.spa-input-text")).sendKeys("Prathapreddybagala");
		
		driver.findElement(By.cssSelector("input[placeholder='Passcode']")).sendKeys("sriBsnl&456");
		
		driver.findElement(By.cssSelector("button#signIn")).click();
		
		driver.findElement(By.cssSelector("div.ico-bg")).getText();
		
		//System.out.println("driver.findElement(By.cssSelector("div.ico-bg")).getText()");  
		
		
		
	}

}
