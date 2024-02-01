package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Core.BasePage;

public class GoogleSearchResultPage extends BasePage{

	
	public GoogleSearchResultPage(WebDriver driver) {
		super(driver);
		//constructor has to be public in this case
		//why public? because initElement Method from PageFactory class call t his constructor
		}
	
	@FindBy(id = "result-stats")
	WebElement divResultStats;
	
	
	@FindBy(name = "q")
	WebElement textSearchBox;
	
	
	public String getSearchedText() {
		return textSearchBox.getAttribute("value");
	}

}
