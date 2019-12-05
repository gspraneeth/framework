package webdr;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gmailTest1 {

	public static void main(String[] args) throws Exception {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
     WebElement username = driver.findElement(By.id("identifierId"));
    
     username.sendKeys("anytime4u.siddu@gmail.com");
     
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     
        	 
     
     
     WebElement password = driver.findElement(By.name("password"));
    
     
     password.sendKeys("Sandeep@123");
     
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     
     
     
     
     
     
     //Actions action = new Actions(driver);
     //action.sendKeys(username,"anytime4u.siddu@gmail.com")
     Thread.sleep(10000);
     
    // WebElement next1 = driver.findElement(By.xpath();
     
    		 
    		 
     driver.quit();
     
	}

}
