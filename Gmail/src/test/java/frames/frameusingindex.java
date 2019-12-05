package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameusingindex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("http://www.ramcocements.in/");
		
		//frames switch into using index 
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("sp_q")).sendKeys("praneeth");
		
		driver.findElement(By.id("btnSearch")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
