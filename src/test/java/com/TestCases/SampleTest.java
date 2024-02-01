package com.TestCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Core.BaseTest;

public class SampleTest extends BaseTest {
	
	@Test
	public void testCase1() {	
			
		//String URL= "https://www.google.co.in/";
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Nishar");
		driver.findElement(By.name("q")).submit();
		String pageURL = driver.getCurrentUrl();
		Assert.assertTrue(pageURL.startsWith("http://www.google.co.in/"),"Page URL is not starting with https://www.google.co.in/");
		driver.findElement(By.name("q")).getAttribute("value");		
	}
	
	@Test
	public void testCase2() {	
		
		//String URL= "https://www.google.co.in/";
		driver.get("https://www.google.co.in/");		
		driver.findElement(By.name("q")).sendKeys("Nishar");
		driver.findElement(By.name("q")).submit();
		
		//First Validation
		String pageURL = driver.getCurrentUrl();
		Assert.assertTrue(pageURL.startsWith("https://www.google.co.in/"),"Page URL is not starting with https://www.google.co.in/");
		
		//Second Validation
		String searchText = driver.findElement(By.name("q")).getAttribute("value");	
		Assert.assertEquals(searchText, "Nishar");
	}
	
}
