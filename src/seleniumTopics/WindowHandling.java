package seleniumTopics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj.manage().window().maximize();
		obj.get("https://www.google.com");
		obj.navigate().to("https://www.rivier.edu/");
		obj.findElement(By.xpath("//*[@id=\"masthead\"]/div/div[2]/div/div[1]/div[1]/div[1]/ul/li[1]/a")).click();
		System.out.println(obj.getTitle());

		String MainWindow = obj.getWindowHandle();

		// To handle all new opened window.
		Set<String> s1 = obj.getWindowHandles();
		System.out.println(s1.size());
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
	while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				
				// Switching to Child window
				obj.switchTo().window(ChildWindow);
				
				
				if(obj.getTitle().equals("https://myrivacademics.rivier.edu/")) {
					System.out.println("check1");
					
					System.out.println(obj.getTitle());
				Alert alert =obj.switchTo().alert();
				String username = "pbagayella";
				String password = "gangaBpr&123";
				System.out.println(alert.getText());
				alert.sendKeys(username+ Keys.SHIFT+ password); 
				}
		
			}

			/*
			 * Set<String> ids = obj.getWindowHandles();
			 *  Iterator<String> it=ids.iterator(); 
			 *  String parentid = it.next(); 
			 *  String childid= it.next();
			 * obj.switchTo().window(childid); System.out.println(obj.getTitle());
			 */

		//	obj.switchTo().alert().accept();

		} 
	
	}
}

