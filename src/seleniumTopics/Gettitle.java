package seleniumTopics;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

		public static void main(String[] args) 
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			System.out.println(driver.getTitle());
		}

	}

