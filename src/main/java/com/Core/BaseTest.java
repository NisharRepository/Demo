package com.Core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	
	protected WebDriver driver;
	
	//Use before browser factory class created
	//@BeforeMethod
	public void initializeDriver() {		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Browser-Driver\\chromedriver-win64\\chromedriver.exe");
	this. driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
		public void initializeDriverAfterBrowserFactory() {		
		driver = BrowserFactory.getInstance();
		driver.manage().window().maximize();
		}
	
	
	@AfterMethod
	public void cleanUp() {
		if(driver !=null) {
			driver.quit();
		}
	}
	

}
