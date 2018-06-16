package seleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class CalenderandDatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("http://www.spicejet.com/");
		String dateVal = "21-08-2018";
		//Thread.sleep(5000);
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)", "");
		WebElement date = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date1\"]"));
		selectDateByJS(driver, date, dateVal);
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
		
	}

	}


