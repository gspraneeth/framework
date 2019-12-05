package uploaddownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class sikuliupload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 /* 
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.indeed.co.in/");
  driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
  driver.findElement(By.xpath("//button[text()='Upload your resume']")).click();
  Thread.sleep(3000);
  Screen screen = new Screen();
  screen.type("D:\\resumegsp.docx");
  screen.click("C:\\canclebt.PNG");
   */
  
  
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.indeed.co.in/");
	
	driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
	
	driver.findElement(By.xpath("//button[text()='Upload your resume']")).click();
	
	 Thread.sleep(3000);
	 
	 Screen screen = new Screen();
	 //type in text filed 
	 screen.type("D:\\resumegsp.docx");
	 //clik button
	 screen.click("C:\\openbt.PNG");
	 

     Thread.sleep(3000);
  
     driver.quit();
	}

}
