package seleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		driver.navigate().to("http://www.tsrtconline.in");
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("Niz");
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//*[@id='fromPlaceName']")).getText());
		
		//  Java Script DOM can extract hidden elements
		// investigate the properties of object if it have any hidden text
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i =0;
		while(!text.equalsIgnoreCase("NIZAMSAGAR"))
		{
			i++;
			driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text=(String)js.executeScript(script);
			System.out.println(text);
			if(i>5)
			{
				break;
			}
		if(i>10) {
			System.out.println("Element Not Found");
		}
		else 
		{
			System.out.println("Element Found");
		}
			
		}
	}

}
