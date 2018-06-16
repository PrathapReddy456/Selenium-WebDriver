 package seleniumTopics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
	// Count Of Links in a page
		
		driver.navigate().to("http://www.qaclickacademy.com/practice.php");
		System.out.println((driver.findElements(By.tagName("a")).size()));
		
	// Count Of Footer Section
		
		System.out.println("Footer Links Are ::");
		WebElement footer = driver.findElement(By.id("gf-BIG")); // Limiting webdriver scope
		System.out.println(footer.findElements(By.tagName("a")).size());
	
	// Count Of links in footer first column
		
		WebElement footercolumn =footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footercolumn.findElements(By.tagName("a")).size());
		
	// Click on each link in column and check if the pages are opening.
		
		for(int i=1;i<footercolumn.findElements(By.tagName("a")).size();i++)
		{
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
			Thread.sleep(5000L);
			Set<String> obj=driver.getWindowHandles();
			Iterator<String>it = obj.iterator();
	
		
			while(it.hasNext())
			{
		    driver.switchTo().window(it.next());
		
		    System.out.println(driver.getTitle());
		}
		
	}
	}



