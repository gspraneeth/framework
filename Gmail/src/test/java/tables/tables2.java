package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables2 {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net");
		
		System.out.println(driver.findElements(By.tagName("table")).size());
		
		System.out.println(driver.findElements(By.xpath("//table")).size());
		
		System.out.println(driver.findElements(By.cssSelector("table")).size());
		
	//	WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		
	//	System.out.println(table.getText());
		
		System.out.println("table rows:" +driver.findElements(By.xpath("//table[@id='example']//tr")).size());
		
		System.out.println("table rows exluding header and footer:"+ driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size());
	
		System.out.println("5th rows data:" +driver.findElement(By.xpath("//table[@id='example']//tr[5]")).getText());
		
		System.out.println("table coloumns:" +driver.findElements(By.xpath("//table[@id='example']//tr[1]//th")).size());
		
		System.out.println("total no.cells:" +driver.findElements(By.xpath("//table[@id='example']//th|//table[@id='example']//td")).size());
		
		System.out.println("text of particular cell (2,3):" +driver.findElement(By.xpath("//table[@id='example']//tr[2]//td[3]")).getText());

		
		driver.quit();
	}

}
