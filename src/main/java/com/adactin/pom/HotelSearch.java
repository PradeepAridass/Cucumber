package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearch {

public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement nrooms;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement checkin;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement checkout;
	
	@FindBy(id = "adult_room")
	private WebElement adult ;
	
	@FindBy(id = "child_room")
	private WebElement child;
	
	@FindBy(id = "Submit")
	private WebElement searchbutton;

	public HotelSearch(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNrooms() {
		return nrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

}
