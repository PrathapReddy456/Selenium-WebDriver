package seleniumTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		String Username= "naveenk";
		 String Password ="test@123";
		 
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		// WebDriver 	driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.freecrm.com");
		
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys(Username);
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys(Password);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame("mainpanel");
		
		//1. Get the list of all the links and images
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of full links and images :"+linksList.size());
List<WebElement>activeLinks= new ArrayList<WebElement>();


// 2. Iterate LinkLists: Exclude all links/ images which doesnt have "href" tagname.
for(int i=0;i<linksList.size();i++) {
	System.out.println(linksList.get(i).getAttribute("href"));
//if(linksList.get(i).getAttribute("href")!=null&&(!linksList.get(i).getAttribute("href").contains("javascript"))){
	if(linksList.get(i).getAttribute("href")!=null) {
	activeLinks.add(linksList.get(i));
	System.out.println("Size of active Links and images"+activeLinks.size());
}
}
//3. Check the href url, with httpconnection api:
	for(int j=0;j<activeLinks.size();j++) {
		HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		
		connection.connect();
		String response =connection.getResponseMessage();
	connection.disconnect();
	System.out.println(activeLinks.get(j).getAttribute("href")+"---"+response);
	
	}
}
}
