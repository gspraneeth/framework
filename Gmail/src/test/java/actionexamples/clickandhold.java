package actionexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://jqueryui.com/droppable/");
  
  driver.switchTo().frame(0);
  
  WebElement drag = driver.findElement(By.id("draggable"));
  WebElement drop = driver.findElement(By.id("droppable"));
  
  Actions action = new Actions(driver);
  
  action.clickAndHold(drag).perform();
  
  action.release(drop).perform();
  
  Thread.sleep(2000);
  
  driver.quit();
  
   
	
	}

}
