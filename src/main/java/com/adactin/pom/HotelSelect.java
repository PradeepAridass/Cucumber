package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelect {

	public HotelSelect(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id = "continue")
	private WebElement selectButton;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getSelectButton() {
		return selectButton;
	}
	
	
}
