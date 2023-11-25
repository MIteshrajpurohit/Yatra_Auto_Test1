package com.TCs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

import com.POM.HomePage_POM;
import com.Utility.DataRead;

public class BaseClass extends DataRead {

	public WebDriver driver;

	public String browser = DataRead.fileR("Browser");
	public String path = DataRead.fileR("Driver");
	public String url = DataRead.fileR("URL");
	  public Actions act = null;
	  public HomePage_POM HP = null;
@BeforeClass
	public void Setup() throws Exception {

		if (browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();

		} else {

			System.out.println("Please choose valid driver");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(2000);
		HP = new HomePage_POM(driver);
		 act = new Actions(driver);	
		

	}

           public static void dropdown(WebElement element , String value) {
        	   Select drodown = new Select(element);
        	   drodown.selectByVisibleText(value);
        	   
           }
       
}
