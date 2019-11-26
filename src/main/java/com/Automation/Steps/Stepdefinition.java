package com.Automation.Steps;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.Automation.Pages.HomePage;
import com.Automation.Pages.LoginPage;
import com.Automation.Utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass{

	LoginPage loginpage ;
	HomePage homepage;
 	
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	    
		BaseClass.initialization();
		
	}

	@Then("^Select the college name and Login Authority$")
	public void select_the_college_name_and_Login_Authority() throws Throwable {
		
			loginpage = new LoginPage();
		
	String title =	loginpage.validateLoginPageTitle();

	Assert.assertEquals("Sri Krishna Engg", title);
	System.out.println(title);
	loginpage.SelectDropdown();
	
	   
	}

	
	@When("^Enter the UserName and Password and click login button$")
	public void enter_the_UserName_and_Password_and_click_login_button() throws Throwable {
		homepage  =	loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	   Thread.sleep(2000);

	    
	} 

	
  	
} 	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	


	
	
	
	
	
	
	
	
	
	
	
	

	
	



