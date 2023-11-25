package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POM {

	
	public WebDriver driver;
	
	public HomePage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id = 'userLoginBlock']")
	WebElement account_btn;
	
	@FindBy(xpath = "//a[@id = 'booking_engine_flights']")
	WebElement Flight_btn;
	@FindBy(xpath="//a[@class='logo']")
	WebElement Logo;
	@FindBy(xpath ="//a[@class='blur_class type-active']")
	WebElement OneWay_btn;
	@FindBy(id="BE_flight_origin_city")
	WebElement txt_origin;
	@FindBy(xpath="//div[@class='ac_airport']")
	WebElement select_city;
	
	@FindBy(id ="BE_flight_arrival_city")
	WebElement txt_arrival;
	@FindBy(id="SignUpBtn")
	WebElement Sign_btn;
	@FindBy(id="login-input")
	WebElement input_txt;
	@FindBy(id="signup-mobile-number")
	WebElement mobile_input_txt;
	@FindBy(id="signup-password")
	WebElement sign_password;
	@FindBy(xpath="//select[@id='signup-user-designation']")
	WebElement Select_Title;
	@FindBy(id="signup-user-first-name")
	WebElement input_first_name;
	@FindBy(id="signup-user-last-name")
	WebElement input_last_name;
	@FindBy(id="signup-form-continue-btn")
	WebElement button_sign;
	@FindBy(id="specialPromoNotif")
	WebElement specialPromoNotif_checkbox;
	@FindBy(id="whatsAppNotif")
	WebElement whatsAppNotif_checkbox;
	
	public WebElement account_btn() {
		WebElement account = account_btn;
		return account;
	}
	public boolean logo() {
		boolean logo = Logo.isDisplayed();
		return logo;
	}
	public WebElement txt_origin() {
		WebElement originField = txt_origin;
		return originField;
		
	}
	public WebElement select_city() {
		WebElement selectcity = select_city;
		return selectcity;
	}
	public WebElement txt_arrival() {
		WebElement arrivalField = txt_arrival;
		return arrivalField;
	}
	
	
	
	
		
	
	
	
}
