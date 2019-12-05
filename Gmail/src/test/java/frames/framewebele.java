package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framewebele {
	
    public static void main(String[] args) throws Exception {
	 
	     WebDriver driver = new ChromeDriver();
	 
		driver.manage().window().maximize();
		
		driver.get("http://www.ramcocements.in/");
		
		//Switch to frame by webElement
		
		WebElement frame = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.name("sp_q")).sendKeys("praneeth");
		
		//driver.findElement(By.id("btnSearch")).click();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("ctl01_HyperLink3")).click();
	
	
		Thread.sleep(3000);
		
	
		
		driver.quit();
	}



}


