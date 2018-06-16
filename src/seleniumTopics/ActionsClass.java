package seleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.com/");
		
		Actions action = new Actions(driver);
		WebElement move = driver.findElement((By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")));
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		action.moveToElement(move).contextClick().build().perform();
		


	}

}
