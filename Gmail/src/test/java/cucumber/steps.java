package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

	WebDriver driver = null;
	
	@Given("open broswerand enter url")
	public void open_broswerand_enter_url() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	
			 
	}

	@When("Enter username and password and click on sigin")
	public void enter_username_and_password_and_click_on_sigin() {
	  
	}

	@Then("user login into application")
	public void user_login_into_application() {
	  
	}

	@When("user click on signoff")
	public void user_click_on_signoff() {
	  
	}

	@Then("user logout from application")
	public void user_logout_from_application() {
	   
	}

	
	
}
