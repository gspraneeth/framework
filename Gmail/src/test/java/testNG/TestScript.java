package testNG;

import org.testng.annotations.Test;

public class TestScript {
  @Test(enabled = true,description = "this method is used to book a ticket")

	 /* public void findNumberofRows() {
	  
	      System.out.println("openbrowser");
	      System.out.println("findrows");
	      System.out.println("closebrowser");
	      */
  public void BookAticket() {
	  
	  System.out.println("bookaticket");
  }
	  
	  @Test(description = "this method is used to cancle a ticket")
	  public void Cancleticket() {
		  System.out.println("cancleticket");
		  
	  }	  
		  
	 @Test(invocationCount = 5)
	 public void prebooking() {
		 System.out.println("prebooking");
	 }
}
  
  
  
  
