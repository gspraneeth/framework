package webdr;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class navigations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/login/");
		Thread.sleep(5000);
         System.out.println(driver.getTitle());
   
       WebElement fblogin= driver.findElement(By.id("email"));
       fblogin.sendKeys("9390430385");
       WebElement fbpassword= driver.findElement(By.name("pass"));
       fbpassword.sendKeys("vinaysonu");
       driver.findElement(By.id("loginbutton")).click();
       Thread.sleep(5000);
       WebElement lgout=driver.findElement(By.id("userNavigationLabel"));
       Thread.sleep(5000);
       Select select = new Select(lgout);
       select.selectByVisibleText("Log out");
       driver.quit();
       
       
       
       
		
		driver.quit();
		
		

	}
}
