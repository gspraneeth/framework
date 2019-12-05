package uploaddownload;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class autoitdownload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumhq.org/");
		
		driver.findElement(By.linkText("Download")).click();
		
		driver.findElement(By.linkText("3.141.59")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\softwares\\download autoit.exe");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
