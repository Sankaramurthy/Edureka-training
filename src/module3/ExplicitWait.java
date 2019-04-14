package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		/*
		 * WebElement Link5 = driver.findElement(By.linkText("LinkText-5"));
		 * wait.until(ExpectedConditions.elementToBeClickable(Link5)); Link5.click();
		 */
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))).click();
		
		/*
		 * WebElement e
		 * =wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5")
		 * )); e.click();
		 */	 		
		
		
		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 12);
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))
		 * ).click();
		 * 
		 */
	}
}
