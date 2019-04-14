package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
	
		//Single Line

		/*
		 * Multy Line Comment
		 */

		//Selenium Basic Commands
		
		//Initialize OR instantiate a Browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\AbhreshWorkspace\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\AbhreshWorkspace\\ExeFiles\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//Close or Quit a Browser
		driver.quit();//it closes all the windows opened during the current instance
		driver.close();//it closes only the current active window opened during this instance
		
		//Get Commands
		driver.get("https://URL");// to open the AUT on the browser
		driver.getTitle();//to fetch the title of the current page
		driver.getCurrentUrl();// to fetch the current page URL 
		driver.getWindowHandle();// to get the window name
		
		
		//Navigation Commands
		driver.navigate().to("URL");//it is used to open URL
		driver.navigate().back();//to go to the previous page
		driver.navigate().forward();//to go to the next already executed page
		driver.navigate().refresh();//to refresh the page
		
		
		//Element handling Commands
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).click();
		
		
	}
}
