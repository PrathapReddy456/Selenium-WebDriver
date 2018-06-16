package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.google.com/");
		driver.navigate().to("http://www.echoecho.com/htmlforms10.htm");
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		//when we don't have any attribute
		
		//driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		
		//Dynamic Radio Buttons
		
	
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i =0; i<count;i++)
		{
			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
			// System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
			if(text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}

}
}