package radiobuttons;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.lowagie.text.List;

public class RdButtion {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/");
		
		WebElement rbbutton = driver.findElement(By.id("RoundTrip"));
		
		rbbutton.click();
		
		System.out.println(rbbutton.isSelected());
		
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.id("FromTag"));
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		action.sendKeys(from," Visakhapatnam" ).perform();
		
		action.sendKeys(Keys.DOWN).perform();
		
		action.sendKeys(Keys.ENTER).perform();
		
		
		
		WebElement to = driver.findElement(By.xpath("//input[@id='ToTag']"));
	
		action.sendKeys(to," Hyderabad" ).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.DOWN).perform();
		
		action.sendKeys(Keys.ENTER).perform();
		
		WebElement datebox= driver.findElement(By.id("DepartDate"));
		//driver.findElement(By.xpath("//a[text()='15'][1]"));
		
		//datebox.sendKeys("21092019");
		
		
		
	java.util.List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ctDatePicker']//td"));
	
	for(WebElement ele:allDates)
	{
		
		String date=ele.getText();
		
		if(date.equalsIgnoreCase("28"))
		{
			ele.click();
			break;
		
		//Thread.sleep(5000);
		
		//driver.findElement(By.id("ReturnDate"));
		
		
		
		
		
		
		
		
		//driver.quit();
		
		
		

	}

	}
	
	}
	
}
