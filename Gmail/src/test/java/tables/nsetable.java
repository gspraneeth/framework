package tables;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nsetable {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
				
		//find number of tables in webPage (three types of strategies)
		
		System.out.println("Number of Tables by using tagname:"+driver.findElements(By.tagName("table")).size());
		System.out.println("Number of Tables by using xpath:"+driver.findElements(By.xpath("//table")).size());
		System.out.println("Number of tables by using cssSelector:"+driver.findElements(By.cssSelector("table")).size());
				
		//how to retrieve table text 
		
		WebElement tabletxt = driver.findElement(By.xpath("//table[@id='topGainers']"));
		System.out.println(tabletxt.getText());
		
		//how to find number of rows
		
		System.out.println(driver.findElements(By.xpath("//table[@id='topGainers']//tr")).size());
		
		
		//how to find number of row excluding 
		System.out.println(driver.findElements(By.xpath("//table[@id='topGainers']//tbody//tr")).size());
				
		//how to get particular row data
		
		WebElement  rowtxt = driver.findElement(By.xpath("//table[@id='topGainers']//tr[3]"));
    	System.out.println(rowtxt.getText());
		
		//how to find number of columns
    	
    WebElement element=	driver.findElement(By.xpath("//table[@id='topGainers']//tr[1]//th"));
    	
    
    	
    	System.out.println();
    	 
    	//System.out.println(driver.findElements(By.xpath("//table[@id='topGainers']//tr[1]//th")).size()).
    	
    	
    	
		
		
		
		
		
		
		
			
		
		
		
		
		
		 
		Thread.sleep(3000);
		
		driver.quit();
	}

}
