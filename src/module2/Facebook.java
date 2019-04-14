package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		//Open browser
		System.setProperty("webdriver.chrome.driver", "D:\\AbhreshWorkspace\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//ID
		driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		driver.findElement(By.id("u_0_l")).sendKeys("Sugandhi");
		/*		
		//name
		driver.findElement(By.name("reg_email__")).sendKeys("987654321");
		
		//ClassName
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		driver.findElement(By.className("inputtext")).clear();
		driver.findElement(By.className("inputtext")).sendKeys("Sugandhi");
		
		
		//LinkText
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		//driver.navigate().back();
		
		//PartialLinkText
		driver.findElement(By.partialLinkText("account?")).click();
		
		//driver.navigate().back();	
		//driver.navigate().forward();
		*/
		//CSS
		//driver.findElement(By.cssSelector("#pass")).sendKeys("Sugandhi");
		
		//TagName
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		//Xpath
		
		
	}

}
