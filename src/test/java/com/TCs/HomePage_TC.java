package com.TCs;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HomePage_TC  extends BaseClass{

	     @Test(priority =1)
	     public void verify_title() {
	    	 String ActualTitle = driver.getTitle();
	    	 String ExpectedTitle = "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com";
	    	 System.out.println(ActualTitle);
	    	 Assert.assertEquals(ActualTitle, ExpectedTitle);
	    	 
	     }
	@Test(priority=2)
	public void verify_account_popup() {
		act.moveToElement(HP.account_btn()).pause(2000).build().perform();
		
	}
	@Test(priority=3)
	public void Verify_selectFlighttxt() throws Exception {
		HP.txt_origin().click();
		Thread.sleep(2000);
		HP.txt_origin().sendKeys("Pune");	
		Thread.sleep(2000);
		HP.select_city().click();
		Thread.sleep(2000);
		HP.txt_arrival().sendKeys("Mumbai");
		Thread.sleep(2000);
		HP.select_city().click();
		driver.findElement(By.xpath("//a[@title='Non Stop Flights']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//td[@class='depart-daybox']")).click();
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
	}
	
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}
	
		
		
		
	
	
	
}
