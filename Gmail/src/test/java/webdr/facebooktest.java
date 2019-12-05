package webdr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktest {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("9505078969");
		
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("ChocoSiddu@143");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(5000);

		//driver.findElement(By.id("userNavigationLabel")).click();
		
		driver.quit();
		
		

	}

}
