package seleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Synchronization {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");

		WebElement loginbtn = driver.findElement(By.cssSelector("input[value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);
		driver.switchTo().frame("mainpanel");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[5]/a"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[5]/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\'title\']")).sendKeys("FReeTT");
		driver.findElement(
				By.xpath("//*[@id=\'prospectForm\']/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/input[3]"))
				.sendKeys("AT&T");
		driver.findElement(By.id("probability")).sendKeys(("70"));

		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\'owner_user_id\']")));
		dropdown.selectByVisibleText("Naveen1 K1 (naveenk1)");
		
		
		
		
		
		driver.findElements(
				By.xpath("//*[@id=\'prospectForm\']/table/tbody/tr[2]/td[2]/table/tbody/tr[6]/td[2]/input[2]")).get(0)
				.click();
		driver.findElements(By.xpath("//*[@id=\'prospectForm\']/table/tbody/tr[2]/td[2]/table/tbody/tr[9]/td[2]/input"))
				.get(0).click();

		driver.findElement(By.xpath("//input[@type='submit'and @value='Save']")).click();

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10); WebElement element =
		 * wait.until (ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//input[@type='submit'and @value='Save']"))); element.click();
		 * 
		 * 
		 * try{ Thread.sleep(5000); }catch (InterruptedException ie1) {
		 * ie1.printStackTrace(); }
		 * 
		 */

		System.out.println("Success");
	}

}
