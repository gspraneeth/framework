package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class hardAssert {
	 
	
		
	@Test
		public void verifytitle() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String expectedname = "Google";
		
		String actualname = driver.getTitle();
		
		Assert.assertEquals(actualname, expectedname);
		
		Thread.sleep(5000);
	 		
		driver.quit();
		
		
		
		
}	
		
		
		
		
		

	

	
	
}
		
	
