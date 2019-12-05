package webdr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.reflections.vfs.Vfs.Dir;

public class newtour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        
        driver.findElement(By.name("password")).sendKeys("mercury");
        
        driver.findElement(By.name("login"));
        
        
        		
        		
        		
        
        
        		
        		
	}

}
