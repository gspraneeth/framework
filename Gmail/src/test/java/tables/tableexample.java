package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tableexample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/");
		
	
		
		//List<WebElement> element = driver.findElements(By.xpath("//table[@id='example']//tr"));
		
		//for(int index = 0;index<=10;index++) {
			WebElement element = driver.findElement(By.xpath("((//table[@id='example']//tr)[4]//td)[2]"));
		
		
	
		
		System.out.println(element.getText());
		
		//System.out.println(element.size());
		
		
		
		
		
	//System.out.println(driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size());
	
	//WebElement table = driver.findElementS(By.xpath("//table[@id='example']//tbody//tr"));
	
	//System.out.println(table.getText());
	
		
		
		
		
		
		
		//System.out.println(driver.findElements(By.xpath("//table[@id='example']//tr")).size());
		
		
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
