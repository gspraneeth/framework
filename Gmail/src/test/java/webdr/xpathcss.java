package webdr;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpathcss {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		
		//find number of text fields
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(list.size());
		/* 
		WebElement from =driver.findElement(By.id("fromPlaceName"));
		
		from.sendKeys("hyderabad");
		
		Thread.sleep(5000);
		
		WebElement to = driver.findElement(By.name("destination"));
		to.sendKeys("vizianagaram");
		to.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[id='searchBtn']")).click();
		
		Alert alert =driver.switchTo().alert();
		Thread.sleep(3000);
		
		System.out.println(alert.getText());
		Thread.sleep(3000);
		
		*/
	
		WebElement from = driver.findElement(By.id("fromPlaceName"));
		
			
		Actions action = new Actions(driver);
		
		action.sendKeys(from, "hyderabad").perform();
		
		Thread.sleep(1000);
		
		action.sendKeys(Keys.ENTER).perform();
				
		WebElement to = driver.findElement(By.id("toPlaceName"));
		
		action.sendKeys(to, "vij").perform();
		
		Thread.sleep(2000);

		
		WebElement text =driver.findElement(By.linkText("VIJAYRAI"));
		
		
		action.click().perform();
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	driver.quit();
		
		
		
				

			
	
		
		
		

	}

}
