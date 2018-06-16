package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// When Element Disabled
	
		  driver.get("https://www.southwest.com");
		  System.out.println("Before Click On OneWay");
		  System.out.println(driver.findElement(By.cssSelector("#air-date-return")).isDisplayed());
		  System.out.println(driver.findElement(By.cssSelector("#air-date-return")).isEnabled());
		  driver.findElement(By.cssSelector("#trip-type-one-way")).click();
		  System.out.println("After Click On OneWay");
		  System.out.println(driver.findElement(By.cssSelector("#air-date-return")).isDisplayed());
		  System.out.println(driver.findElement(By.cssSelector("#air-date-return")).isEnabled());
		  System.out.println(driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div[1]/h2")).getText());
		

		  /*
		// When Element Disappeared

		driver.get("https://www.indianeagle.com");
		System.out.println("Before Click On OneWay");
		System.out.println(driver.findElement(By.cssSelector("#returnDate")).isDisplayed());
		driver.findElement(By.cssSelector("#searchForm > div > div > div.panel-body.bg-grey > div.form-group.btn-group.btn-group-justified > label:nth-child(2) > span")).click();
		System.out.println("After Click On OneWay");
		
		int count = driver.findElements(By.xpath("//*[@id=\"returnDate\"]")).size();
		if (count==0) {
			System.out.println("Element is Disappeared");
		}
*/
	}

}
