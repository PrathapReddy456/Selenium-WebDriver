package seleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_DrogDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame")));
Actions as = new Actions(driver);
WebElement Source = driver.findElement(By.id("draggable"));
WebElement target = driver.findElement(By.id("droppable"));

as.dragAndDrop(Source, target).build().perform();

driver.switchTo().defaultContent(); // it come out from frame to normal window
	}

}
