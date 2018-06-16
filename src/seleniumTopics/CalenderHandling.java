package seleniumTopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.aa.com");
	driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[2]/div/label/button")).click();
	
	while(!driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > div > div > span.ui-datepicker-month")).getText().contains("October"))
	{
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
	 
	}
	
	// Try to grab Unique attribute/ Put into list and iterate
	List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
	
	int count =driver.findElements(By.className("ui-state-default")).size();
	 
	for(int i =0;i<count; i++)
	{
		String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
		if(text.equals("31"))
		{
			driver.findElements(By.className("ui-state-default")).get(i).click();
		break;
		}
		
	}
	}

}
