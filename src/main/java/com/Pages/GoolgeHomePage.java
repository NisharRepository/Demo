package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Core.BasePage;

public class GoolgeHomePage extends BasePage {
	
	public GoolgeHomePage(WebDriver driver) {
		super(driver);
		//constructor has to be public in this case
		//why public? because initElement Method from PageFactory class call t his constructor
		}
	
	//Data Member (Fields)	
	//WebElement textQueryBox1 =  driver.findElement(By.name("q"));
	//OR
	@FindBy(name = "q")
	WebElement textQueryBox;
	
	@FindBy(name = "btnK")
	WebElement btnGooleSearch;
	
	//Methods
	
	public void performSearch(String textToSearch) {
		textQueryBox.sendKeys(textToSearch);//we are giving Parameter because we don't want hardcoded
		textQueryBox.submit();
	}
	

}
