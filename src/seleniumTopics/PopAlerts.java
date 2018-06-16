package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopAlerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input"))
				.click();
		System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().sendkeys("prathap");
		driver.switchTo().alert().accept(); // Accept is for "Ok, done, success etc.."
		// driver.switchTo().alert().dismiss();

	}
	

}
