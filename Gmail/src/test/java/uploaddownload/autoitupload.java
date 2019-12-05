package uploaddownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoitupload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  driver.get("https://www.indeed.co.in/");
		  driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
		  driver.findElement(By.xpath("//button[text()='Upload your resume']")).click();
		  Thread.sleep(3000);
		 Runtime.getRuntime().exec("C:\\softwares\\auto2.exe");
		  Thread.sleep(10000);
		  driver.quit();
	}

}


