package examp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampractic2 {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.usps.com/");
		
		driver.findElement(By.xpath("//*[@id=\"login-register-header\"]")).click();
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Prathap");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sriBsnl@502");
		
		driver.findElement(By.xpath("//*[@id=\"btn-submit\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"response-msg\"]/div")).getText();
		
		
	}
}


