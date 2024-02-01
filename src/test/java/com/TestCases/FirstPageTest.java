package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Core.BaseTest;
import com.Pages.GoogleSearchResultPage;
import com.Pages.GoolgeHomePage;

public class FirstPageTest extends BaseTest {
	@Test
	public void testCase1() {	
			
		//String URL= "https://www.google.co.in/";
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Nishar");
		driver.findElement(By.name("q")).submit();
		String pageURL = driver.getCurrentUrl();
		Assert.assertTrue(pageURL.startsWith("http://www.google.co.in/"),"Page URL is not starting with https://www.google.co.in/");
				
	}
	
	@Test
	public void testCase2() {	
		
		driver.get("https://www.google.co.in/");
		//now browser is having google home page opened.
		//create object of google home page
		
		GoolgeHomePage homePage = new GoolgeHomePage(driver);
		//even if the object is created the WebElements of "GoolgeHomePage" are not initialize yet
		// WebElement Like textQueryBox & btnGooleSearch of GoolgeHomePage
		//initialize the WebElement		
		PageFactory.initElements(driver, homePage);		
		homePage.performSearch("Nishar");
		String expectedStartUrl = "https://www.google.co.in/";
		Assert.assertTrue(driver.getCurrentUrl().startsWith(expectedStartUrl),"Page URL is not starting with https://www.google.co.in");
		
	}
	
	@Test
	public void testCase3() {	
		
		//Optimization of testCase2
		
		driver.get("https://www.google.co.in/");
		//now browser is having google home page opened.
		
		//create object of google home page & initialize the WebElement	in single line of code		
		GoolgeHomePage homePage = PageFactory.initElements(driver, GoolgeHomePage.class);		
		homePage.performSearch("Nishar");
		GoogleSearchResultPage resultPage = PageFactory.initElements(driver, GoogleSearchResultPage.class);
		String expectedStartUrl = "https://www.google.co.in/";
		//SyncUtil.wait(3);
		Assert.assertTrue(resultPage.getUrl().startsWith(expectedStartUrl),"Page URL is not starting with https://www.google.co.in");
		Assert.assertEquals(resultPage.getSearchedText(), "Nishar","Searched text did not match");
		
	}
	
	

}
