package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {

	
	WebDriver driver = null;
    @BeforeTest
    public void openbrowser() {
            driver = new ChromeDriver();	      	
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
} 
        	
    @Test
     public void login() {
    	driver.get("http://newtours.demoaut.com/");
    	driver.findElement(By.name("userName")).sendKeys("mercury");
    	driver.findElement(By.name("password")).sendKeys("mercury");
    	driver.findElement(By.name("login")).click();
    	
    }
    
    @Test(priority = 2,dependsOnMethods = "login")
    public void bookATicket() {
       	driver.findElement(By.name("findFlights")).click();
    	driver.findElement(By.name("reserveFlights")).click();
    	driver.findElement(By.name("buyFlights")).click();
    }
    @Test(priority = 3,dependsOnMethods = "login")
    public void logoff() {
    	driver.findElement(By.linkText("SIGN-OFF")).click();
    }
    @AfterTest
    public void closebrowser() throws Exception {
    	Thread.sleep(3000);
    	driver.quit();
    }
    
    	
}
        	


