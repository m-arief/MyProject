package com.Automation.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver ;
	public static Properties prop;
	
	
	public BaseClass () {
	
	prop = new Properties ();
	
	try {
		FileInputStream fis = new FileInputStream("/Users/arief/eclipse-workspace/MyProject/src/test/resources/config.properties");
		
		prop.load(fis);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	public static void initialization() {
	
		String browserName  = prop.getProperty("browser");
		
		
			
			System.setProperty("webdriver.chrome.driver","/Users/arief/Desktop/chromedriver");
			driver = new ChromeDriver();
			
	
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout( UtillClass.pageLoadTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtillClass.implicitWait, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
	


