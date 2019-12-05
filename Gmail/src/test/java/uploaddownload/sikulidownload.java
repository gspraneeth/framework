package uploaddownload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;



public class sikulidownload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumhq.org/");
		
		driver.findElement(By.linkText("Download")).click();
		
		driver.findElement(By.linkText("3.141.59")).click();
		
		Thread.sleep(3000);
		
		Screen screen = new Screen();
		
		screen.click("C:\\saveasbt.PNG");
		
		Thread.sleep(3000);
		
		
		File file =new File("C:\\Users\\vamsi\\Downloads\\selenium-server-standalone-3.141.59.jar");
		
		Thread.sleep(3000);
		
		if (file.exists()) {
			System.out.println("download");
			
		} else {
			System.out.println("fail to download");

		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
