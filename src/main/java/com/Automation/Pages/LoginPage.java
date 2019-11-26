package com.Automation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Automation.Utilities.BaseClass;


public class LoginPage extends BaseClass {
	
	//page factory  or object repository
	
	
	@FindBy(id = "college_id")
	WebElement  SelectSchool;
	
	@FindBy(name = "authority")
	WebElement  authority;
	
	@FindBy(name = "username")
	WebElement  username;
	

	@FindBy(name = "password")
	WebElement password;
	
	@FindBy (name = "login")
	WebElement loginButton;
	
	// initializing the page object
	
    public LoginPage() {
	PageFactory.initElements(driver,this);
    }
	//action
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	
	}
	
	public void SelectDropdown() {
		
		Select select = new Select (SelectSchool);
		select.selectByVisibleText("SKEC");
		Select aselect = new Select (authority);
		aselect.selectByVisibleText("HOD");
		}
	
	public HomePage login (String un,String pwdd) {
	
		username.sendKeys(un);
		password.sendKeys(pwdd);
		loginButton.click();
	   return new HomePage();
	}
	
	






	
	
	
	
	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}