package examp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class owncssxpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.flipkart.com");
		
		driver.findElement(By.cssSelector("a._2k0gmp")).click();
		
		driver.findElement(By.cssSelector("input[class='_2zrpKA']")).sendKeys("prathap");
		
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Prathap");
		
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SriBsnl@567");
		
		//driver.findElement(By.cssSelector("button[class*='_7UHT_c']")).click();
		

}
}
