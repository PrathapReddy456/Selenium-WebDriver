package examp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examp1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// System.out.println(driver.getPageSource());
		
		// System.out.println(driver.getCurrentUrl());
		
		// System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.rivier.edu") ;
		
		driver.navigate().back();
		
		// driver.navigate().forward();
		
		//driver.close();
		 // driver.quit();
	}

}


	
