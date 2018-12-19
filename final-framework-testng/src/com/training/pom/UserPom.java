package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPom {

private WebDriver driver; 
	
	public UserPom(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="User list")
	private WebElement userName;
	
	public void clickUserList() {
		this.userName.click();
		
	}
	
}
