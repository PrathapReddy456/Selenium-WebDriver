package examp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Example2 {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
//		driver.findElement(By.id("Email")).sendKeys("prathapreddy876@gmail.com");
		
		
		WebElement web=driver.findElement(By.cssSelector("#email"));
		web.sendKeys("prathapreddy876@gmail.com ");
		
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sri ");
		
		driver.findElement(By.linkText("Forgot account?")).click();
		
		
		   
		

	}

}
