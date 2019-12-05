package actionexamples;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class dubleclick {
  public static void main(String[] args) throws Exception {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
   
  
 driver.get("https://api.jquery.com/dblclick/");
 

 driver.switchTo().frame(0);
// Entering into frame using switchto commend by index number '0'
 
 
 WebElement element = driver.findElement(By.tagName("div"));
 // finding a element by using tagName strategy and stored into element object
 
 Actions actions = new Actions(driver);
 //creating an Actions class in the webDriver
 
 actions.doubleClick(element).perform();
 //performing action on webElement(element) object
 
 Thread.sleep(2000);
 
 driver.quit();
 
 
  
 
  }
		
}
