package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class BackLogIn {

	public static WebDriver driver;
	
	@FindBy(linkText = "Click here to login again")
	private WebElement backLogIn;

	public BackLogIn(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBackLogIn() {
		return backLogIn;
	}
	
	
}
