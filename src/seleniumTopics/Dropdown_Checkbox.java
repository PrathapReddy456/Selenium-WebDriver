package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Checkbox {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.navigate().to("http://www.spicejet.com");
	
	// Static drop Down
	
	Select s = new Select(driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency")));
	s.selectByValue("USD");
	s.selectByIndex(2);
	s.selectByVisibleText("INR");
	
	
	// Dynamic Drop Down
	
	driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='HYD']")).click();
	driver.findElement(By.xpath("(//a[@value='IXJ'])[2]")).click();
	
	// Check BOX
	
	driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).click();
	System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).isSelected());
	 
}
	
}