package actionexamples;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws Exception  {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}
}	
*/

     driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		
		driver.switchTo().frame(2);
		WebElement drag = driver.findElement(By.id("drag1"));
		WebElement drop = driver.findElement(By.id("div2"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
